package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat SimpleDateFormat1 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        Date date = SimpleDateFormat.parse(reader.readLine());

        System.out.println(SimpleDateFormat1.format(date).toUpperCase());
    }
}
