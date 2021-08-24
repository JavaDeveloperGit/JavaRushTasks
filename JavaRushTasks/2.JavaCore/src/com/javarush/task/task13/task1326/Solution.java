package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Type your path: ");
        String file = reader.readLine();
        InputStream in = new FileInputStream(new File(file));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(in));

        ArrayList <Integer> list1 = new ArrayList<>();

        String line;

        while ((line = reader1.readLine()) != null) {
            int number = Integer.parseInt(line);
            list1.add(number);
        }

        int[] list = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++) {
            int b = list1.get(i);
            list[i] = b;
        }

        //Сортируем
        for(int i = list.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( list[j] > list[j+1] ){
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }

        //Выводим только чётные
        for(int i = 0; i < list.length; i++){
            int a = list[i];
            if(a%2 == 0){
                System.out.println(a);
            }
        }

        in.close();
        reader.close();
        reader1.close();

    }
}
