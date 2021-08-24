package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String sWithoutExtraEscapes=string.replaceAll("\\s+"," ").trim();

        String words[]=sWithoutExtraEscapes.split(" ");// разбить каждое слово выше строки
        String capitalizedWord = "";         // создать пустую строку

        for(String w : words)
        {
            String first = w.substring(0,1);    // получить первый символ каждого слова
            String f_after = w.substring(1);    // получить оставшийся символ соответствующего слова
            capitalizedWord = capitalizedWord + first.toUpperCase() + f_after+ " ";  // используйте первый символ с заглавными буквами, добавьте оставшиеся в пустую строку и продолжайте
        }
        System.out.println(capitalizedWord);
    }
}
