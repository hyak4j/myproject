package com.hyak4j.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestTest(){
        final int english = 60;
        final int math = 80;
        Student student = new Student("Henry", english, math);
        Assertions.assertEquals(Math.max(english, math), student.highest());
    }

    @Test
    void averageTest(){
        final int english = 60;
        final int math = 80;
        Student student = new Student("Henry", english, math);
        Assertions.assertEquals((english + math) / 2, student.getAverage());
    }
}
