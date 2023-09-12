package org.example;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
