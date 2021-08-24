package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String name;
        private String surname;
        private byte age;
        private boolean sex;
        private String address;
        private int Salary;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, byte age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, byte age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, byte age, boolean sex, String address) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, String surname, byte age, boolean sex, String address, int salary) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.address = address;
            Salary = salary;
        }

        public Human(String name, byte age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int salary) {
            this.name = name;
            Salary = salary;
        }

        public Human(String name, String surname, int salary) {
            this.name = name;
            this.surname = surname;
            Salary = salary;
        }
    }
}
