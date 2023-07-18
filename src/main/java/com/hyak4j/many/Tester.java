package com.hyak4j.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();

//        list();

//        set();
        HashMap<String, String> stocks = new HashMap<>();
//        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        for (String key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        System.out.println(stocks.get("2330"));
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(6);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(5);
        System.out.println(list);
        int n1 = list.get(0);

        List<Integer> scores = Arrays.asList(68, 87, 77, 88, 99);
        for (int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
        int[] scores = {68, 87, 77, 88, 99};

        for (int i = 0; i < 5; i++){
            System.out.println(scores[i]);
        }

        for (int n : scores){
            System.out.println(n);
        }
    }
}
