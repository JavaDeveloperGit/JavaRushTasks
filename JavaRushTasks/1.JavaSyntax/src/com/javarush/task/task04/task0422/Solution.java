package com.javarush.task.task04.task0422;

/* 
18+
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

        if (nNumber1 < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
