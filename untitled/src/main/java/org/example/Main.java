package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;


public class Main {
    public static void main(String[] args) throws Exception {

        var context = new AnnotationConfigApplicationContext(Configure.class);


        var cat = context.getBean(Cat.class);

        System.out.println(cat.toString());

        var person = context.getBean(Person.class);


        System.out.println(person.toString());

    }
}
