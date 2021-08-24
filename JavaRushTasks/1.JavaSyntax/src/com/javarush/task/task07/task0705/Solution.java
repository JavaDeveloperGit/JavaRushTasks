package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array1 = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int i = 0; i < 20; i++) {
            array1[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
        }

        for (int i = 10; i < 20; i++) {
            array3[i-10] = array1[i];
        }

        for (int number: array3) {
            System.out.println(number);
        }
    }
}
