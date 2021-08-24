package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int count = 0;

        if (nNumber1 > 0) {
            count = count + 1;
        }

        if (nNumber2 > 0) {
            count = count + 1;
        }

        if (nNumber3 > 0) {
            count = count + 1;
        }

        System.out.println(count);
    }
}
