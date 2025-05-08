package org.prasad.demo.repo;

import org.prasad.demo.Model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
}
