package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbers[] = new int[5];

        for (int i = 0; i <= 4; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

    }

    public static void sort (int[] numbers) {
        int length = numbers.length;
        for (int out = length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(numbers[in] > numbers[in + 1]) {
                    int temp = numbers[in];
                    numbers[in] = numbers[in + 1];
                    numbers[in + 1] = temp;
                }
            }
        }
    }
}
