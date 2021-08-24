package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
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

        if (nNumber1 < nNumber2) {
            System.out.println(nNumber1);
        } else {
            if (nNumber1 > nNumber2) {
                System.out.println(nNumber2);
            } else {
                System.out.println(nNumber1);
            }
        }
    }
}