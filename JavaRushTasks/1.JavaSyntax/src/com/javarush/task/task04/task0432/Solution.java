package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String Stroka = bufferedReader.readLine();

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        int i = 0;
        while (i < nNumber1) {
            System.out.println(Stroka);
            i++;
        }
    }
}
