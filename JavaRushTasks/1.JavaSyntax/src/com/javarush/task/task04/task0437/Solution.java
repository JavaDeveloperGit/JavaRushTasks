package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= counter; j++) {
                System.out.print("8");
            }
            counter++;
            System.out.println();
        }
    }
}
