-- 庫存 
-- 建立一個View, 名稱 : Inventory
-- id, name, 買進數量, 買進總價, 賣出數量, 賣出總價
SELECT  p.id,                                   -- id
        p.name,                                 -- name                    
        pu.PU_QUANTITY as PU_QUANTITY,          -- 買進數量
        pu.PU_AMOUNT as PU_AMOUNT,              -- 買進總價
        sa.SA_QUANTITY as SA_QUANTITY,          -- 賣出數量
        sa.SA_AMOUNT as SA_AMOUNT               -- 賣出總價
FROM T_Product p
LEFT JOIN (
    SELECT  p.ID as pid,     
            SUM(pu.QUANTITY) as PU_QUANTITY, 
            SUM(pu.PRICE * pu.QUANTITY) as PU_AMOUNT 
    FROM T_PRODUCT p, T_PURCHASE pu 
    WHERE p.ID = pu.PID 
    GROUP BY p.ID) as pu
ON p.id = pu.pid

LEFT JOIN (
    SELECT  p.ID as pid, 
            SUM(sa.QUANTITY) as SA_QUANTITY, 
            SUM(sa.PRICE * sa.QUANTITY) as SA_AMOUNT 
    FROM T_PRODUCT p, T_Sales sa 
    WHERE p.ID = sa.PID 
    GROUP BY p.ID) as sa
ON p.id = sa.pid;