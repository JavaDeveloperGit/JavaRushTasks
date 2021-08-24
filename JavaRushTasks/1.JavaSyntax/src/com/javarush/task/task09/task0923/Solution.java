package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> alvowels = new ArrayList<Character>();
        ArrayList<Character> alconsonant = new ArrayList<Character>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        String sEntered = reader.readLine();

        char[] allChar = sEntered.toCharArray();

        for (int i = 0; i < allChar.length; i++) {
            if (Character.isSpaceChar(allChar[i])) continue;
            if (isVowel(allChar[i])) alvowels.add(allChar[i]);
            else alconsonant.add(allChar[i]);
        }

        for (int i = 0; i < alvowels.size(); i++)
            System.out.print(alvowels.get(i) + " ");

        System.out.println();

        for (int i = 0; i < alconsonant.size(); i++)
            System.out.print(alconsonant.get(i) + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}