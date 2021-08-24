package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        if (nNumber1 > 0) {
            nNumber1 = 2 * nNumber1;
        } else {
            if (nNumber1 < 0) {
                nNumber1 = nNumber1 + 1;
            }
        }

        System.out.println(nNumber1);
    }
}