package com.bridgelabz;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * purpose - To simulate Generics Method
 * GenericsPgm implements an application that
 * generates max. of three variables with more than three value
 * Using Generic class
 *
 * @author Sunil
 * @version 16.0
 * @since 16/08/2021
 */
public class GenericPgm<E extends Comparable<E>> {
    E[] myArr;

    public GenericPgm(E[] myArr) {
        this.myArr = myArr;
    }

    /**
     * comapring three variable taking more than three variables using Generic class
     * using Arrays to create more than three values
     */
    public static <E extends Comparable<E>> E compareMaximum(E[] myArr) {
        Arrays.sort(myArr);
        int value = myArr.length;
        return myArr[value - 1];
    }

    /**
     * declaring the main method
     * printing the maximum value of Integer
     * printing the maximum value of Float
     * printing the maximum value of String
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Method Programing");
        Integer[] value1 = {23, 45, 63, 11, 76, 44, 90};
        System.out.println("the maximum value of three Integer Variables :" + compareMaximum(value1));
        Float[] value2 = {23.435f, 43.98f, 76.54f, 11.34f, 23.44f, 79.09f};
        System.out.println("the maximum value of three Float Variables :" + compareMaximum(value2));
        String[] value3 = {"zlatanIbrah", "leoMessi", "aguera", "neymarJr", "ronaldino"};
        System.out.println("the maximum value of three String Variables :" + compareMaximum(value3));
    }
}