package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String number4 = bufferedReader.readLine();
        int nNumber4 = Integer.parseInt(number4);

        int Max1 = Max(nNumber1, nNumber2);
        int Max2 = Max(nNumber3, nNumber4);
        System.out.println(Max(Max1, Max2));
    }

    public static int Max(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            if (a < b) {
                c = b;
            } else {
                c = a;
            }
        }
        return c;
    }
}

