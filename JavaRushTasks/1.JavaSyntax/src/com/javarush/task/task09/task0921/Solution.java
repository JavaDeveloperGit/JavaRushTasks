package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a;
            try {
                a = Integer.parseInt(bufferedReader.readLine());//типу помилка при парсінгу може вилетіти
                arrayList.add(a);
            } catch (NumberFormatException | IOException e) {
                //System.out.println(e);
                arrayList.forEach(System.out::println);
                break;
            }
        }
    }
}
