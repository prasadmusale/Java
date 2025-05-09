package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Entity declares that this class has to be managed by hibernate .
@Entity
public class Student {

    @Id
    private int id ;
    private String name;
    private int marks ;

    public int getId(){
        return id ;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    @Override
    public String toString(){
        return id + " , " + name + " , " + marks ;
    }
}
