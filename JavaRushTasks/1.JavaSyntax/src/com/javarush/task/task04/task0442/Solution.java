package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
        public static void main(String[] args) throws Exception {

        int counter = 0;

        while (true) {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String number1 = bufferedReader.readLine();
            int nNumber1 = Integer.parseInt(number1);

            counter = counter + nNumber1;

            if (nNumber1 == -1) {
                System.out.println(counter);
                break;
            }
        }
    }
}
