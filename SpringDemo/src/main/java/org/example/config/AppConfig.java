package org.example.config;

import org.example.Computer;
import org.example.Desktop;
import org.example.Alien;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//
//    //we can assign another name also to bean as given or the default name for bean is method name
//    //@Bean(name = {"com1","desktop1","beast"})
//    @Bean
//    //@Scope("prototype") //prototype scope will create different object for each reference variables
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien( Computer com){ // @Qualifier("desktop")
//    Alien obj  = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
