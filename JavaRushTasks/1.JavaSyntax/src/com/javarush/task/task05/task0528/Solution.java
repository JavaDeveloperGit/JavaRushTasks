package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) +
                " " + (calendar.get(Calendar.MONTH) + 1) +
                " " + calendar.get(Calendar.YEAR));
    }
}
