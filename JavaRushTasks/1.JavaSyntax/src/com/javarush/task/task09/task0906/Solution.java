package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String method = Thread.currentThread().getStackTrace()[2].getMethodName();
        String nameClass = Thread.currentThread().getStackTrace()[2].getClassName();
        System.out.println(nameClass + ": " + method + ": " + s);
    }
}
