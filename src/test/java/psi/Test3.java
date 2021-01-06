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


public class Test3 {
    
    @Test
    public void t3(){

        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        PurchaseRepository purchaseRepository = ctx.getBean(PurchaseRepository.class);
        SalesRepository salesRepository = ctx.getBean(SalesRepository.class);
        
        // 賣出商品
        Product p1 = productRepository.findOne(1);
        Product p2 = productRepository.findOne(2);
        Product p3 = productRepository.findOne(3);

        Sales s1 = new Sales(50, 20, p1);
        Sales s2 = new Sales(70, 10, p2);
        Sales s3 = new Sales(100, 20, p3);
        Sales s4 = new Sales(120, 10, p3);
        Sales s5 = new Sales(50, 10, p1);
        salesRepository.save(Arrays.asList(s1, s2, s3, s4, s5));
        System.out.println("OK");

    }
}
