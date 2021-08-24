package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(bufferedReader.readLine());
        }

        int minLength = strings.get(0).length(); // minimum

        for (int i = 0; i < 9; i++) {
            if (strings.get(i + 1).length() < minLength) {
                minLength = strings.get(i + 1).length();
            }
        }

        int maxLength = strings.get(0).length(); // maximum

        for (int i = 0; i < 9; i++) {
            if (strings.get(i + 1).length() > maxLength) {
                maxLength = strings.get(i + 1).length();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() == minLength || strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
        }

    }
}
