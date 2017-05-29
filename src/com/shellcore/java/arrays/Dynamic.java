package com.shellcore.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Cesar. 29/05/2017.
 */
public class Dynamic {

    public static void main(String[] args) {

        System.out.println("-----Dynamic Structures-----");
        System.out.println("");

        // ArrayList
        System.out.println("Empty ArrayList:");
        ArrayList<String> dynamicList = new ArrayList<>();
        System.out.println(dynamicList);
        System.out.println("");

        System.out.println("Add an element to the arrayList:");
        dynamicList.add("I'm dynamic");
        System.out.println(dynamicList);
        System.out.println("My size: " + dynamicList.size());
        System.out.println("");

        System.out.println("Add a second element to the arrayList:");
        dynamicList.add("I'm growing");
        System.out.println(dynamicList);
        System.out.println("My size: " + dynamicList.size());
        System.out.println("");

        // String Pool
        System.out.println("Creating String \"I'm growing\" and another one");
        String grow = "I'm growing", other = "other";
        System.out.println("== compare the direction (pointer) of a Object");
        System.out.println(grow == dynamicList.get(1));
        System.out.println(other == dynamicList.get(1));
        System.out.println("The two string have the same value so,\nthe String Pool of JVM assign the same\ndirection for both strings");
        System.out.println("");

        // HashMap
        System.out.println("Empty HashMap");
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map);
        map.put(10, "I'm dynamic");
        System.out.println(map);
        map.put(25, "I'm growing");
        System.out.println(map);
        System.out.println("");

        // String Pool
        System.out.println("See doesn't matter on what structure the string are stored");
        System.out.print("String \"I'm growing\": ");
        System.out.println(dynamicList.get(0) == map.get(10));
        System.out.print("String \"I'm dynamic\": ");
        System.out.println(dynamicList.get(1) == map.get(25));
        System.out.println("They're just a reference to the String Pool");
    }
}
