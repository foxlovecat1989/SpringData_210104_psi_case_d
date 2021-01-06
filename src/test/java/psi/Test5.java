package psi;

import com.spring.mvc.psi.entities.Inventory;
import com.spring.mvc.psi.entities.Inventory2;
import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Purchase;
import com.spring.mvc.psi.entities.Sales;
import com.spring.mvc.psi.repository.Inventory2Repository;
import com.spring.mvc.psi.repository.InventoryRepository;
import com.spring.mvc.psi.repository.ProductRepository;
import com.spring.mvc.psi.repository.PurchaseRepository;
import com.spring.mvc.psi.repository.SalesRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test5 {
    
    @Test
    public void t5(){

        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        Inventory2Repository inventoryRepository = ctx.getBean(Inventory2Repository.class);
        List<Inventory2> inventories = inventoryRepository.findAll();
        inventories.stream().forEach(System.out::println);
    }
}
