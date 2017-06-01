package com.shellcore.java.arrays;

import java.util.HashMap;

/**
 * Created by Cesar. 01/06/2017.
 */
public class ScreencastHashmap {

    public static void main(String[] args) {

        HashMap<Integer, String> months = new HashMap<>();

        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        System.out.println(months.get(1));
        System.out.println(months.get(12));
        System.out.println(months.get(13));

        HashMap<String, String> countries = new HashMap<>();
        countries.put("GTM", "Guatemala");
        countries.put("USA", "United States of America");
        countries.put("CHN", "China");
        countries.put("ESP", "Spain");

        countries.forEach((code, name) -> System.out.println("Code: " + code + ", Name: " + name));
    }
}
