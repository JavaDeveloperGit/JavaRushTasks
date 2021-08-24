package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> strings = new ArrayList<>();
        ArrayList<Integer> strings1 = new ArrayList<>();
        ArrayList<Integer> strings2 = new ArrayList<>();
        ArrayList<Integer> strings3 = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            strings.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < 20; i++) {
            if (strings.get(i) % 3 == 0) {
                strings1.add(strings.get(i));
            }

            if (strings.get(i) % 2 == 0) {
                strings2.add(strings.get(i));
            }

            if (strings.get(i) % 3 != 0 & strings.get(i) % 2 != 0) {
                strings3.add(strings.get(i));
            }
        }

        printList(strings1);
        System.out.println();
        printList(strings2);
        System.out.println();
        printList(strings3);
    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}
