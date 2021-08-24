package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name1");
        map.put("Surname3", "Name5");
        map.put("Surname4", "Name7");
        map.put("Surname5", "Name7");
        map.put("Surname6", "Name5");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name8");
        map.put("Surname9", "Name9");
        map.put("Surname10", "Name10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> entry : copy.entrySet()) {

            String checkSurname = entry.getValue();
            int counter = 1;

            for (Map.Entry<String, String> entry2 : map.entrySet()){
                if (entry2.getValue().equals(checkSurname)) {
                    counter++;
                }
            }

            if (counter > 2) {
                removeItemFromMapByValue(map, checkSurname);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, String> map7 = createMap();

        for (Map.Entry<String, String> pair : map7.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }

        removeTheFirstNameDuplicates(map7);

        System.out.println("-----------------------------");

        for (Map.Entry<String, String> pair : map7.entrySet()) {
            System.out.println(pair.getKey() + "---" + pair.getValue());
        }
        */
    }
}
