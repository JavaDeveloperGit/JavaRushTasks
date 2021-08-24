package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("January", 1);
        hashMap.put("February", 2);
        hashMap.put("March", 3);
        hashMap.put("April", 4);
        hashMap.put("May", 5);
        hashMap.put("June", 6);
        hashMap.put("July", 7);
        hashMap.put("August", 8);
        hashMap.put("September", 9);
        hashMap.put("October", 10);
        hashMap.put("November", 11);
        hashMap.put("December", 12);

        if (hashMap.containsKey(name)) {
            System.out.println(name +  " is the " + hashMap.get(name) + " month ");
        }
    }
}
