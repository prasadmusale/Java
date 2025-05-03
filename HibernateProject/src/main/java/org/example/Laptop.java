package org.example;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable//Embeddded is used when we have to Embedded one table/class to another like we are embedding laptop into alien class .
@Entity
public class Laptop {
    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;
    //for many to one relationship
//    @ManyToOne
//    private Alien alien;
    @ManyToMany(mappedBy = "laptops")
    private List<Alien> aliens;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }



    public void setRam(int ram) {
        this.ram = ram;
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", aliens=" + aliens +
                '}';
    }
}
