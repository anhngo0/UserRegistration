package com.example.demo.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Predicate;

@Configuration
public class EmailValidator implements Predicate<String> {
    //regex to validate the email
    @Override
    public boolean test(String s) {
        return true;
    }
}
