package com.hyak4j.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student student = new Student("Henry", 70, 100);
        Student student2 = new Student("Tom", 60, 50);
        Student student3 = new Student("Jane", 30, 50);

        GraduateStudent gstu = new GraduateStudent("Jack", 60, 60 , 60);
        gstu.print();

        student.print();
        student2.print();
        student3.print();
        System.out.println("High score: " + student.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student`s name: ");
        String name = scanner.next();
        System.out.println("Please enter student`s English score: ");
        int english = scanner.nextInt();
        System.out.println("Please enter student`s Math score: ");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println("High score: " + student.highest());
    }
}
