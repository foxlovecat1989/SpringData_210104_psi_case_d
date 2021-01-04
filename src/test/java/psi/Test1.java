package psi;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {
    
    @Test
    public void t1(){
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springMVC-servlet.xml");
        
    }
}
