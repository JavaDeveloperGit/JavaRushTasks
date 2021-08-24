package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        if (nNumber1 > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
