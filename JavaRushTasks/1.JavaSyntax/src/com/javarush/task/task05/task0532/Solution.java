package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        int a0 = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= maximum - 1; i++) {
            int a1 = Integer.parseInt(reader.readLine());
            if (a0 < a1) {
                a0 = a1;
            }
        }

        System.out.println(a0);
    }
}
