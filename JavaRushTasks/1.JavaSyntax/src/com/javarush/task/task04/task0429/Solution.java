package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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

        int countPositive = 0;
        int countNegative = 0;
        if (nNumber1 > 0) {
            countPositive = countPositive + 1;
        } else {
            if (nNumber1 < 0){
                countNegative = countNegative + 1;
            }
        }

        if (nNumber2 > 0) {
            countPositive = countPositive + 1;
        } else {
            if (nNumber2 < 0){
                countNegative = countNegative + 1;
            }
        }

        if (nNumber3 > 0) {
            countPositive = countPositive + 1;
        } else {
            if (nNumber3 < 0){
                countNegative = countNegative + 1;
            }
        }


        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
