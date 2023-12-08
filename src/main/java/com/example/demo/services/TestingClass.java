package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

public class TestingClass {
    public static void main(String[] args) {
        Student.StudentBuilder builder = Student.builder();
        Teacher teacher = Teacher.builder().cash(220).build();

//        Student student = Student.builder()
//                .sid(12)
//                .cash(330)
//                .build();
        Student student = Student.builder()
                .sid(22)
                .cash(99)
                .build();
        System.out.println(student.readingStudent());
        System.out.println(student.teaching());
        System.out.println(student);
//        String subbu = UtilityOfStudent.toUpperCaseChange("subbu");
//        System.out.println(subbu);
    }
}
