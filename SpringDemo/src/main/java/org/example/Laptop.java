package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object is created");
    }

    public void compile(){
        System.out.println("compiling");
    }



}
