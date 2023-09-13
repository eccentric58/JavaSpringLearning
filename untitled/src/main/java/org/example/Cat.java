package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public Cat() {
        System.out.println("кот создан");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }



}
