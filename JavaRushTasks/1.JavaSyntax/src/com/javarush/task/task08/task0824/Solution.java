package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> children0 = new ArrayList<>();

        Human child1 = new Human("Child1", true, 10, children0);
        Human child2 = new Human("Child2", true, 11, children0);
        Human child3 = new Human("Child1", false, 12, children0);

        ArrayList<Human> children = new ArrayList<>();

        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Father", true, 50, children);
        Human mother = new Human("Mother", false, 50, children);

        ArrayList<Human> allChildren1 = new ArrayList<>();
        allChildren1.add(father);

        ArrayList<Human> allChildren2 = new ArrayList<>();
        allChildren2.add(mother);

        Human grandFather1 = new Human("grandFatherName1", true, 90, allChildren1);
        Human grandMother1 = new Human("grandMotherName1", false, 90, allChildren1);

        Human grandFather2 = new Human("grandFatherName2", true, 90, allChildren2);
        Human grandMother2 = new Human("grandMotherName2", false, 90, allChildren2);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
