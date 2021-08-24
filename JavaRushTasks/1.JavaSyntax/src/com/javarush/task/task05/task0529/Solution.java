package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int summa = 0;

        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals("сумма")){
                break;
            } else {
                summa = summa + Integer.parseInt(s);
            }
        }

        System.out.println(summa);
    }
}
