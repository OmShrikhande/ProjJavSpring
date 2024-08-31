package com.example.withoutweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //(day3)

    /*
   // @Autowired //this is field injection
    private Laptop laptop;


    //the constructor injection
//        public Dev(Laptop laptop){
//            this.laptop = laptop;
//        }

    // the setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop= laptop;
//    }
    public void build(){
       laptop.compile();
        System.out.println("working on Awesome project");
    }


     */


    //(Day4)
    @Autowired
    private Computer computer;

    public void build(){
        computer.compile();
        System.out.println("working on Awesome project");
    }
}
