package org.prasad.demo.service;


import org.prasad.demo.repo.LaptopRepository;
import org.prasad.demo.Model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    private LaptopRepository repo ;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }

}
