package com.example.demo.model;

import com.example.demo.services.UtilityOfStudent;
import lombok.*;
import lombok.experimental.SuperBuilder;

//@RequiredArgsConstructor//to intiliaze final properties
//@NoArgsConstructor
//@RequiredArgsConstructor
//@AllArgsConstructor
@SuperBuilder
public class Student extends Teacher  {
    private int sid;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", cash=" + cash +
                '}';
    }
    public int readingStudent(){
        return this.sid;
    }
}
