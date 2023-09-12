package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Configure.class);


        var cat = context.getBean(Cat.class);

        cat.setName("Василий");
        System.out.println(cat.getName());


    }
}
