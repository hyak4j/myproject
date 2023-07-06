package com.hyak4j;

public class Hello {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1, 4));
        Person p = new Person("Henry", 66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score > 80 && score < 90);
        char c ='A'; // 65
        System.out.println(c > 65);
        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Henry";*/
    }
}
