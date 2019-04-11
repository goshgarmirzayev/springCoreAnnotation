package main;

import az.company.costumer.inter.ICostumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBeanXml.xml");
        SpringApplication.run(FirstApplication.class, args);
        ICostumerService cus = (ICostumerService) appContext.getBean("costumerService");
        System.out.println(cus.getUsers());
    }

}
