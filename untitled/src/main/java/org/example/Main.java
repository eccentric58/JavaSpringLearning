package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Configure.class);

        var person = context.getBean(Person.class);
        var cat = context.getBean(Cat.class);


        System.out.println(person.getName() + "\n" + cat.getName());


    }
}
