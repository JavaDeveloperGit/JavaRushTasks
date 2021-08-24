package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) {
        int stackTraceLength = method1().length - method10().length + 1;
        System.out.println(stackTraceLength);
    }

    public static StackTraceElement[] method1() {
        return method2();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        return method3();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        return method4();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        return method5();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        return method6();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method6() {
        return method7();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method7() {
        return method8();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method8() {
        return method9();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method9() {
        return method10();
        //return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();

    }
}
