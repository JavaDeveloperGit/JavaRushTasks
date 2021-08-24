package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("MAY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Map<String, Date> map1 = new HashMap<>();

        for (Map.Entry<String, Date> entry : map.entrySet()) {
            map1.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Date> entry : map1.entrySet()) {
            if (entry.getValue().getMonth() < 8 && entry.getValue().getMonth() > 4) {
                map.remove(entry.getKey());
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        /*Map<String, Date> map = createMap();

        for (Map.Entry<String, Date> pair : map.entrySet()) {
                System.out.println(pair.getKey() + "---" + pair.getValue());
        }

        removeAllSummerPeople(map);

        System.out.println("-------------------------------");

        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }
        */
    }
}
