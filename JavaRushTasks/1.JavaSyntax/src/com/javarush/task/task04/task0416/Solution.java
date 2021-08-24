package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        double nNumber1 = Double.parseDouble(number1);

        double a = nNumber1 % 5;


        if(a < 5 && a >= 4) {
            System.out.println("красный");
        }
        if (a < 4 && a >= 3) {
            System.out.println("жёлтый");
        }
        if (a < 3 && a >= 0) {
            System.out.println("зелёный");
        }

    }
}