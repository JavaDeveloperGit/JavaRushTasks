package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 1;
        this.color = "White";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "White";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 1;
        this.age = age;
        this.color = "White";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public void initialize(int weight, String color, String address) {
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public static void main(String[] args) {

    }
}
