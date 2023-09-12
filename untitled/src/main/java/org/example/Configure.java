package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Bean
    Cat cat() {
        Cat cat = new Cat();
        cat.setName("Василий");

        return cat;
    }

    @Bean
    Person person() {
        Person person = new Person();
        person.setName("Дмитрий");

        return person;
    }

}
