package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int nNumber2 = Integer.parseInt(number2);

        System.out.println(name + " получает " + nNumber1 + " через " + nNumber2 + " лет.");
    }
}
