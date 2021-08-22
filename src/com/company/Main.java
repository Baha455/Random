package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(generateRandomAge(0, 99));
        System.out.println(fun1(42, 22));
        System.out.println(fun1(18, 20));
        System.out.println(fun1(18, -10));
        System.out.println(fun1(46, 30));
        System.out.println(fun1(46, 22));
        System.out.println(fun1(generateRandomAge(0,99), generateRandomAge(0, 99)));
    }

    public static String fun1(int age, int temp) {

        String text1 = "Можно идти гулять";
        String text2 = "Оставайтесь дома";
        if (age > 20 && age < 45)
            if (temp > -20 && temp < 30) {
                return text1;
            }
        if (age < 20)
            if (temp > 0 && temp < 28){
            return text1;
        }
        if (age > 45)
            if (temp > -10 && temp < 25){
            return text1;
        }
        return text2;
    }


    public static int generateRandomAge(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
