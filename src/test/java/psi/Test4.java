package psi;

import com.spring.mvc.psi.entities.Inventory;
import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Purchase;
import com.spring.mvc.psi.entities.Sales;
import com.spring.mvc.psi.repository.InventoryRepository;
import com.spring.mvc.psi.repository.ProductRepository;
import com.spring.mvc.psi.repository.PurchaseRepository;
import com.spring.mvc.psi.repository.SalesRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 {
    
    @Test
    public void t4(){

        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        InventoryRepository inventoryRepository = ctx.getBean(InventoryRepository.class);
        List<Inventory> inventories = inventoryRepository.findAll();
        inventories.stream().forEach(System.out::println);
    }
}
