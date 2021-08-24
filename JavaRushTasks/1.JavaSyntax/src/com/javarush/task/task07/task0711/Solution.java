package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String s = list.get(4);
            list.remove(4);
            list.add(0, s);
        }

        list.forEach(System.out::println);
    }
}
