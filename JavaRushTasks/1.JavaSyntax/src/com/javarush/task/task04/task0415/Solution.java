package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);
        String number2 = bufferedReader.readLine();
        int nNumber2 = Integer.parseInt(number2);
        String number3 = bufferedReader.readLine();
        int nNumber3 = Integer.parseInt(number3);

        if (nNumber1 + nNumber2 > nNumber3 &&
                nNumber2 + nNumber3 > nNumber1 &&
                nNumber1 + nNumber3 > nNumber2) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}