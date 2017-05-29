package com.shellcore.java.arrays;

import java.util.Arrays;

/**
 * Created by Cesar. 26/05/2017.
 */
public class Static {

    public static void main(String[] args) {
        int intArray[] = new int[3];
        System.out.println("Arreglo con enteros primitivos");
        System.out.println(Arrays.toString(intArray));
        System.out.println("");

        Integer integerArray[] = new Integer[3];
        System.out.println("Arreglo con objetos de la clase 'Integer'");
        System.out.println(Arrays.toString(integerArray));

        integerArray[0] = new Integer(5);
        System.out.println(Arrays.toString(integerArray));
        System.out.println("");

        Foo fooArray[] = {new Foo(1), new Foo(2), new Foo(3)};
        System.out.println("Arreglo de objetos de la clase 'Foo'");
        System.out.println(Arrays.toString(fooArray));

        fooArray[1] = null;
        System.out.println(Arrays.toString(fooArray));


    }
}
