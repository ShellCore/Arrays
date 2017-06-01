package com.shellcore.java.arrays;

/**
 * Created by Cesar. 29/05/2017.
 */
public class Sreencast {

    public static void main(String[] args) {
        String[] maleStudents = new String[5];

        maleStudents[0] = "James";
        maleStudents[1] = "John";
        maleStudents[2] = "David";
        maleStudents[3] = "Joseph";
        maleStudents[4] = "Charles";

        System.out.println("Male Students:");

        for (int sequence = 0; sequence < maleStudents.length; sequence++) {
            System.out.println(sequence + 1 + ", " + maleStudents[sequence]);
        }
        System.out.println("");

        String femaleStudents[] = {
                "Mary",
                "Susan",
                "Michelle",
                "Sarah",
                "Ashley"
        };

        System.out.println("Female Students:");

        for (int sequence = 0; sequence < femaleStudents.length; sequence++) {
            System.out.println(sequence + 1 + ", " + femaleStudents[sequence]);
        }
        System.out.println("");

        String[] studentList = new String[] {
                "Jason",
                "Gloria",
                "Paul",
                "Lisa"
        };


        System.out.println("Student list:");
        int sequence = 1;
        for (String student : studentList) {
            System.out.println(sequence + ", " + student);
            sequence++;
        }
    }
}
