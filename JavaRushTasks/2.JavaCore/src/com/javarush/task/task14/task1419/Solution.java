package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream is = new FileInputStream(new File(""));
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[0];
            int a = array[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("qwe");

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            Object obj = null;
            obj.hashCode();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }

        try {
            new Solution().clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }

        try {
            Map<String, String> map = new HashMap<>();
            map.put("1", "Один");
            map.put("2", "Два");
            map.put("3", "Три");

            for (Map.Entry pair : map.entrySet()) {
                if (pair.getKey().equals("1")) {
                    map.entrySet().remove(pair);
                }
            }
        } catch (Exception e5) {
            exceptions.add(e5);
        }
    }
}
