package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Surname1", 100);
        map.put("Surname2", 200);
        map.put("Surname3", 300);
        map.put("Surname4", 400);
        map.put("Surname5", 500);
        map.put("Surname6", 600);
        map.put("Surname7", 700);
        map.put("Surname8", 800);
        map.put("Surname9", 900);
        map.put("Surname10", 1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        /*Map<String, Integer> map1 = createMap();

        printMap(map1);

        removeItemFromMap(map1);

        printMap(map1);*/
    }
}
