package com.shellcore.java.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Cesar. 29/05/2017.
 */
public class ScreencastArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Banana");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input EXIT when you have finished.");

        String item = "";

        do {
            item = scanner.next();

            if (!item.equalsIgnoreCase("EXIT") && !list.contains(item)) {
                list.add(item);
            }
        } while (!item.equalsIgnoreCase("EXIT"));

        System.out.println(list);
    }
}
