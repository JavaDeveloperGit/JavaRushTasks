package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {
        boolean odd = false;

        Date yearDate = new Date(date);

        Date startTime = new Date(date);
        startTime.setDate(1);
        startTime.setMonth(0);

        long msTimeDistance = yearDate.getTime() - startTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = 1 + (int) (msTimeDistance/msDay);

        if (dayCount % 2 != 0)
            odd = true;

        return odd;
    }
}
