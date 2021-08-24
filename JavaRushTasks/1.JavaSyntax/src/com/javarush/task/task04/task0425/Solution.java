package com.javarush.task.task04.task0425;

/* 
Цель установлена!
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

        if (nNumber1 > 0 && nNumber2 > 0) {
            System.out.println("1");
        }
        if (nNumber1 > 0 && nNumber2 < 0) {
            System.out.println("4");
        }
        if (nNumber1 < 0 && nNumber2 > 0) {
            System.out.println("2");
        }
        if (nNumber1 < 0 && nNumber2 < 0) {
            System.out.println("3");
        }
    }
}
