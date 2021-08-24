package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        if(nNumber1 >= 100 && nNumber1 <= 999) {
            if(nNumber1 % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        } else {
            if (nNumber1 >= 10 && nNumber1 <= 99) {
                if(nNumber1 % 2 == 0) {
                    System.out.println("четное двузначное число");
                } else {
                    System.out.println("нечетное двузначное число");
                }
            } else {
                if (nNumber1 >= 1 && nNumber1 <=9) {
                    if(nNumber1 % 2 == 0) {
                        System.out.println("четное однозначное число");
                    } else {
                        System.out.println("нечетное однозначное число");
                    }
                }
            }
        }
    }
}
