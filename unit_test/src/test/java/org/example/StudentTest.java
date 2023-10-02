package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Student student = new Student("Sadyk",20);
        assertEquals("Sadyk",student.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Student student = new Student("Adilet",20);
        assertEquals("Adilet",student.getName());


    }
    @org.junit.jupiter.api.Test
    void setNameIfEmpty() {
        Student student = new Student("",20);
        student.setName("Adilet");
        assertEquals("Adilet",student.getName());


    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}