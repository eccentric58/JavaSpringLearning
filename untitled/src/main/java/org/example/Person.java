package org.example;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    Cat cat;

    public Person() {
        System.out.println("Человек создан");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;

    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Имя человека: " + name +
                "\n" + " имя Кота хозяина: " + cat.getName();
    }
}
