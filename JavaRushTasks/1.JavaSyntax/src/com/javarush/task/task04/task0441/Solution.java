package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int nNumber1 = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int nNumber2 = Integer.parseInt(number2);

        String number3 = bufferedReader.readLine();
        int nNumber3 = Integer.parseInt(number3);

        if (Max(nNumber1, nNumber2) == Max(nNumber1, nNumber3)) {
            System.out.println(Max(nNumber2, nNumber3));
        } else {
            if (Max(nNumber2, nNumber1) == Max(nNumber2, nNumber3)) {
                System.out.println(Max(nNumber1, nNumber3));
            } else {
                if (Max(nNumber3, nNumber1) == Max(nNumber3, nNumber2)) {
                    System.out.println(Max(nNumber1, nNumber2));
                }
            }
        }
    }

    public static int Max (int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int Min (int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }
}
