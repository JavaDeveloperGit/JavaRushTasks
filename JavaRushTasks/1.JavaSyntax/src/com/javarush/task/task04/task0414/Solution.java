package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        if (nNumber1 % 400== 0) {
            System.out.println("количество дней в году: 366");
        } else {
            if (nNumber1 % 100 == 0) {
                System.out.println("количество дней в году: 365");
            } else {
                if (nNumber1 % 4 == 0) {
                    System.out.println("количество дней в году: 366");
                } else {
                    System.out.println("количество дней в году: 365");
                }
            }
        }
    }
}