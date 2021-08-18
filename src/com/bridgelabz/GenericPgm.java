package com.bridgelabz;

/**
 * purpose - To simulate Generics Method
 * MaxOf#Integers implements an application that
 * generates max. of three Integer value
 *
 * @author Sunil
 * @version 16.0
 * @since 16/08/2021
 */
public class GenericPgm {
    /**
     * comapring three variable values using Generic Method
     *
     * @param firstOne first parameter
     * @param secOne   second parameter
     * @param thirdOne third parameter
     */
    public static <E extends Comparable<E>> E compareMaximum(E firstOne, E secOne, E thirdOne) {
        E maximumNumber = firstOne;
        if (secOne.compareTo(maximumNumber) > 0)
            maximumNumber = secOne;
        if (thirdOne.compareTo(maximumNumber) > 0)
            maximumNumber = thirdOne;
        return maximumNumber;
    }

    /**
     * declaring the main method
     * printing the maximum value of Integer
     * printing the maximum value of Float
     * printing the maximum value of String
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Method Programing");
        Integer num1 = 33, num2 = 56, num3 = 39;
        System.out.println("the maximum value of three Integer Variables :" + compareMaximum(num1, num2, num3));
        Float f1 = 23.435f, f2 = 76.54f, f3 = 55.12f;
        System.out.println("the maximum value of three Float Variables :" + compareMaximum(f1, f2, f3));
        String name1 = "leoMessi", name2 = "zlatanIbrah", name3 = "aguera";
        System.out.println("the maximum value of three String Variables :" + compareMaximum(name1, name2, name3));
    }
}