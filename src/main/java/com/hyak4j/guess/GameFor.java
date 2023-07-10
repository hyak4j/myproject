package com.hyak4j.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum = 0;
        for (int i = 5; i >= 1; i--){
            sum += i;
            System.out.println("i: " + i + " sum: " + sum);
        }*/
        int secret = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++){
            System.out.println("Please enter a number: (" + i + "/4)");
            int number = scanner.nextInt();
            System.out.println("No" + i + ":" + number);
            if (number > secret){
                System.out.println("Lower");
            }else if (number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Bingo!");
                break;
            }
            if (i == 4){
                System.out.println("Game Over!");
                break;
            }
        }
        System.out.println("End");
    }
}
