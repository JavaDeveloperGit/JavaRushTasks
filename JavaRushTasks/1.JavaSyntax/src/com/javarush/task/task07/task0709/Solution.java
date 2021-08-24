package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }

        int minLength = strings.get(0).length();

        for (int i = 0; i < 4; i++) {
            if (strings.get(i + 1).length() < minLength) {
                minLength = strings.get(i + 1).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));
            }
        }
    }
}
