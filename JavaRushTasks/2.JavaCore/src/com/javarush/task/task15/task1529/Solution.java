package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (NullPointerException e){
            System.out.println("daun");
        }


    }

    public static CanFly result;

    public static void reset() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("helicopter")) {
            result = new Helicopter(); 
            //sc.close();
        } else if (s.equals("plane")) {
            result = new Plane(4); 
            //sc.close();}
        }
    }
}
