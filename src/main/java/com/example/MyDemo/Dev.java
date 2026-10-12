package com.example.MyDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired  // Field Injection
    @Qualifier("laptop")
    private Computer comp;

    // Constructor Injection
//    private Laptop laptop;
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }


    // Setter Injection
//    private Laptop laptop;
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }


    public void build(){
        comp.compile();
        System.out.println("This is awesome");
    }
}
