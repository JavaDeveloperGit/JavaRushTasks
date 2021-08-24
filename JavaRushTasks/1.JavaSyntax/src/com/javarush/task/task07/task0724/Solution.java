package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Tom1", true, 88);
        Human grandFather2 = new Human("Tom2", true, 88);
        Human grandMother1 = new Human("Ann1", false, 88);
        Human grandMother2 = new Human("Ann2", false, 88);
        Human Father = new Human("Tom", true, 48, grandFather1, grandMother1);
        Human Mother = new Human("Ann", false, 48, grandFather2, grandMother2);
        Human son1 = new Human("Tom3", true, 18, Father, Mother);
        Human son2 = new Human("Tom4", true, 18, Father, Mother);
        Human daughter = new Human("Ann3", false, 18, Father, Mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}