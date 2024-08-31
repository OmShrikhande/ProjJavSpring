package com.example.withoutweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("desktop") // when there is 2 files with the @component and no file we want to make primary and both file have implemented same method, or we can say both has same type
    private Computer computer;

    public void build(){
        computer.compile();
        System.out.println("working on Awesome project");
    }
}
