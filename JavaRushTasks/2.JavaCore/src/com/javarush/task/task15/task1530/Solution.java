package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker b = new TeaMaker();
LatteMaker a = new LatteMaker();
a.pour();
a.getRightCup();
b.putIngredient();
b.getRightCup();
a.pour();
a.putIngredient();
    }
}
