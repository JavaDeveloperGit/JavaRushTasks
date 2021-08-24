package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        double Summa = 0.0;
        int count = 0;

        while (true) {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String name = bufferedReader.readLine();
            int nNumber = Integer.parseInt(name);

            if (nNumber == -1) {
                break;
            } else {
                Summa = Summa + nNumber;
                count++;
            }
        }
        System.out.println(Summa / count);
    }
}
