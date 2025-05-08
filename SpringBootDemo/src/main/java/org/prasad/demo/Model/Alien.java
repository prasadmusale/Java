package org.prasad.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien  {

    @Value("25")
    private int age;
    private Computer com;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com){
        this.com = com;
    }

    public Computer getCom(){
        return com;
    }
    public void code(){
        com.compile();
    }
}
