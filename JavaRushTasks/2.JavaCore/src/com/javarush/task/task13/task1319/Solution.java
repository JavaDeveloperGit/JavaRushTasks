package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String s = null;

            while (true) {
                s = reader.readLine();
                if (s.equals("exit")) {
                    writer.write(s + '\n');
                    break;
                }
                writer.write(s + '\n');
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
