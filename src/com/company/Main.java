package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        printFactors();
    }

    public static void printFactors (){

        int factor = 1;
        int number = getInteger();

        while(!checkIfNegative(number) || number > 1000){
            System.out.println("Invalid Value");
            number = getInteger();
        }
        System.out.println(number);
        findFactor(factor, number);

    }
    private static int findFactor(int factor, int number){
        if (number % factor == 0){
            System.out.println(factor);
        }
        factor++;
        if (factor > number){
            return -1;
        }
        else return findFactor(factor, number);
    }

    public static boolean checkIfNegative (int number){
        return number >= 1;
    }

    public static int getInteger (){
        Random random = new Random();
        return random.nextInt();
    }
}