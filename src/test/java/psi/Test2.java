package psi;

import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Purchase;
import com.spring.mvc.psi.entities.Sales;
import com.spring.mvc.psi.repository.ProductRepository;
import com.spring.mvc.psi.repository.PurchaseRepository;
import com.spring.mvc.psi.repository.SalesRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    
    @Test
    public void t1(){

        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        PurchaseRepository purchaseRepository = ctx.getBean(PurchaseRepository.class);
        SalesRepository sales = ctx.getBean(SalesRepository.class);
        
        // 買進商品
        Product p1 = productRepository.findOne(2);
        Product p2 = productRepository.findOne(2);
        Product p3 = productRepository.findOne(3);
        
        Purchase u1 = new Purchase(10, 20, p1); // price, quantity, product
        Purchase u2 = new Purchase(15, 25, p2);
        Purchase u3 = new Purchase(20, 30, p3);
        Purchase u4 = new Purchase(15, 30, p1);
        Purchase u5 = new Purchase(20, 10, p2);
       
        purchaseRepository.save(Arrays.asList(u1, u2, u3, u4, u5));
        System.out.println("OK");
        
    }
}
