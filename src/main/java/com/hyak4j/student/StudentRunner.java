package com.hyak4j.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student student = new Student("Henry", 70, 100);
        student.print();
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
