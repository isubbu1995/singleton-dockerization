package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@SuperBuilder
public class Teacher {
    public float cash;

    public String teaching(){
        return "i am teachig"+cash;
    }
}
