package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //way of accessing container in spring project having java based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desk = context.getBean("desktop" ,Desktop.class);
        Desktop desk1 = context.getBean(Desktop.class);
        desk1.compile();
        Desktop desk2 = context.getBean(Desktop.class);
        desk2.compile();

        Alien alien = context.getBean("alien",Alien.class);
        alien.setAge(23);
        System.out.println(alien.getAge());
        alien.code();






        //        //for XML configuration for spring
//        //ClassPathXmlApplicationContext creats both container and object of defined beans .
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        //object named alien will be refrenced from container using getbeans method.
//        Alien alien = (Alien) context.getBean("alien");
//        System.out.println(alien.getAge());
//        alien.code();
//        System.out.println(Integer.toString(alien.getAge()) + " " + Integer.toString(alien.getSalary()) + " " + alien.getLap());

    }
}
