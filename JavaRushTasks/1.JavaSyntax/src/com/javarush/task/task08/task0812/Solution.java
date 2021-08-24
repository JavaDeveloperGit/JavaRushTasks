package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arrayList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        int currentElement = arrayList.get(0);
        int generalCount = 1;
        int localCount = 1;



        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (currentElement == arrayList.get(i + 1)) {
                localCount++;
                if (localCount > generalCount) {
                    generalCount = localCount;
                }
            } else {
                currentElement = arrayList.get(i + 1);
                localCount = 1;
            }
        }

        System.out.println(generalCount);
    }
}
