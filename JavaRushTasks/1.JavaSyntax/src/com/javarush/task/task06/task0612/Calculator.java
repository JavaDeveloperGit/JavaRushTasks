package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return (a + b);
    }

    public static int minus(int a, int b) {
        return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static double division(int a, int b) {
        return ((double) a / b);
    }

    public static double percent(int a, int b) {
        return ((a * b) / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(plus(5, 3));
        System.out.println(minus(5, 3));
        System.out.println(multiply(5, 3));
        System.out.println(division(5, 3));
        System.out.println(percent(5, 3));
    }
}