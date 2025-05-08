package org.example;


import jakarta.persistence.*;

import java.util.List;

@Entity//(name=entity.alien) if we want to change entity name .
//@Table(name=alien_table)
public class Alien {
    @Id// To make aid primary key
    private int aid;
    //@Column(name=alien_name)
    private String aname;
    //@Transient(When we want to define any variable in object but don't want to add it in table as column)
    private String tech;
//Used for one to one relationship between alien and laptop .
    //    @OneToOne
//    private Laptop laptop;

//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops ;

    @ManyToMany
    private List<Laptop> laptops;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }



    public void setAid(int aid) {
        this.aid = aid;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
