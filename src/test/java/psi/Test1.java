package psi;

import com.spring.mvc.psi.entities.Product;
import com.spring.mvc.psi.entities.Sales;
import com.spring.mvc.psi.repositories.ProductRepository;
import com.spring.mvc.psi.repositories.PurchaseRepository;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
    
    @Test
    public void t1(){
        ClassPathXmlApplicationContext ctx = 
            new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        PurchaseRepository purchaseRepository = ctx.getBean(PurchaseRepository.class);
        Sales sales = ctx.getBean(Sales.class);
        
        
               List<Product> products =  Arrays.asList("Apple", "Banna", "Coco", "Dog", "Elemant")
                        .stream()
                        .map(name -> new Product(name, null))
                        .collect(Collectors.toList());
               
               System.out.println(products);
                        
    }
}
