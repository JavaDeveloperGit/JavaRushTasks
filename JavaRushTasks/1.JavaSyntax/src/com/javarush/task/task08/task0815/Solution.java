package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Surname1", "Name1");
        hashMap.put("Surname2", "Name2");
        hashMap.put("Surname3", "Name3");
        hashMap.put("Surname4", "Name4");
        hashMap.put("Surname5", "Name5");
        hashMap.put("Surname6", "Name6");
        hashMap.put("Surname7", "Name7");
        hashMap.put("Surname8", "Name8");
        hashMap.put("Surname9", "Name9");
        hashMap.put("Surname10", "Name10");
        return hashMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int a = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if(name.equals(pair.getValue())){
                a++;
            }
        }
        return a;
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int a = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if(lastName.equals(pair.getKey())){
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
    }
}
