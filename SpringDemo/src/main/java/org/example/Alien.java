package org.example;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age ;
    //private int salary ;
    private Computer com;

    public Alien(){
        System.out.println(" Alien Object created");
    }

    public Alien(int age , int salary , Laptop lap){
        this.age = age;
        //this.salary = salary;
        //this.lap = lap;
    }

    public int getAge() {
        return age;
    }

//    public void setSalary(int salary){
//        this.salary = salary;
//    }
//
//    public int getSalary(){
//        return salary ;
//    }

    public void setAge(int age) {
        System.out.println("setter method has called");
        this.age = age;
    }

//    public void setLap(Laptop lap){
//        this.lap = lap;
//    }
//
//    public Laptop getLap(){
//        return lap;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding");
        //lap.compile();
    }
}
