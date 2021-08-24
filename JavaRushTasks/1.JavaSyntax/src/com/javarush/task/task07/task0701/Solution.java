package com.javarush.task.task07.task0701;

import java.awt.image.SinglePixelPackedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {
            String s = bufferedReader.readLine();
            a[i] = Integer.parseInt(s);
        }

        return a;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i + 1] > max) {
                max = array[i + 1];
            }
        }
        return max;
    }
}
