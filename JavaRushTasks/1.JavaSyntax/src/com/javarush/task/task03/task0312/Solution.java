package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {
        int t1 = convertToSeconds(2);
        int t2 = convertToSeconds(3);
        System.out.println(t1);
        System.out.println(t2);
    }
}
