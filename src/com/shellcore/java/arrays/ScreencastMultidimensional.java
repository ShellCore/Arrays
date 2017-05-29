package com.shellcore.java.arrays;

/**
 * Created by Cesar. 29/05/2017.
 */
public class ScreencastMultidimensional {

    public static void main(String[] args) {

        // Table for dogs and cats
        String[][] pets = new String[2][3];

        // Filling the "Dog" column
        pets[0][0] = "French Poodle";
        pets[0][1] = "Boxer";
        pets[0][2] = "Chihuahua";

        // Filling the "Cat" column
        pets[1][0] = "British Shorthair";
        pets[1][1] = "Himalayan";
        pets[1][2] = "Siberian";

        // Print the table
        for (int type = 0; type < pets.length; type++) {
            for (int breed = 0; breed < pets[type].length; breed++) {
                System.out.println(pets[type][breed]);
            }
            System.out.println("");
        }
    }
}
