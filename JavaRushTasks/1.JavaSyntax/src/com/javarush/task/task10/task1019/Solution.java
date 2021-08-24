package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();        // объявил словарь, строки - уникальные

        while(true) {
            String num = reader.readLine();
            if(num.equals("")) break;               // выход из цикла при вводе пустой строки вместо числа
            String word = reader.readLine();

            // проверка на наличия пустого значения по указанному индексу
            // если строка введена повторно, то она будет пропущена, потому что map.get(word) будет непустой
            map.putIfAbsent(word, Integer.parseInt(num));
        }

        // вывод в цилке, сначала число потом строку
        for(Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}
