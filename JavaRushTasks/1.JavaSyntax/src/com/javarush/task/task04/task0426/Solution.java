package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        if (nNumber1 < 0 && nNumber1 % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else {
            if (nNumber1 < 0 && nNumber1 % 2 != 0) {
                System.out.println("отрицательное нечетное число");
            } else {
                if (nNumber1 == 0) {
                    System.out.println("ноль");
                } else {
                    if (nNumber1 > 0 && nNumber1 % 2 == 0) {
                        System.out.println("положительное четное число");
                    } else {
                        if (nNumber1 > 0 && nNumber1 % 2 != 0) {
                            System.out.println("положительное нечетное число");
                        }
                    }
                }
            }
        }
    }
}
