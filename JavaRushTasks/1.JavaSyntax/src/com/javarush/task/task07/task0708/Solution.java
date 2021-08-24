package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }

        int maxLength = strings.get(0).length();

        for (int i = 0; i < 4; i++) {
            if (strings.get(i + 1).length() > maxLength) {
                maxLength = strings.get(i + 1).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
            }
        }
    }
}
