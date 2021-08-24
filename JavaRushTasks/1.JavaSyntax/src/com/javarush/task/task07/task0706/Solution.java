package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + array[i];
            } else {
                oddSum = oddSum + array[i];
            }
        }

        if (evenSum > oddSum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
