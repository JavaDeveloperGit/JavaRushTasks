package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();

        map.put("LastName1", "Name1");
        map.put("LastName1", "Name2");
        map.put("LastName3", "Name3");
        map.put("LastName4", "Name4");
        map.put("LastName5", "Name5");
        map.put("LastName6", "Name6");
        map.put("LastName7", "Name7");
        map.put("LastName8", "Name7");
        map.put("LastName9", "Name9");
        map.put("LastName10", "Name10");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
