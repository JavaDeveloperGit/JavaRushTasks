package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> hashMap = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            hashMap.put(city, family);
        }

        /*for (HashMap.Entry<String, String> s : hashMap.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }*/

        // Read the city
        String city = reader.readLine();

        if (hashMap.containsKey(city)) {
            System.out.println(hashMap.get(city));
        }
    }
}
