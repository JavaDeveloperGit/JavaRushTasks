package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a, b, c;

        a = number / 100;
        number = number - a * 100;
        b = number / 10;
        number = number - b * 10;
        c = number;
        return (a + b + c);
    }
}