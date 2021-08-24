package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int nNumber2 = Integer.parseInt(number2);

        String number3 = bufferedReader.readLine();
        int nNumber3 = Integer.parseInt(number3);

        System.out.println("Меня зовут " + name1 + ".");
        System.out.println("Я родился " + nNumber3 + "." + nNumber2 + "." + nNumber1);
    }
}
