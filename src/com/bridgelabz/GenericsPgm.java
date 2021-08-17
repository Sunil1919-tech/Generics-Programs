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
public class GenericsPgm<E extends Comparable> {
    E first, second, third;

    public GenericsPgm(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    //conditon to calculate the maximum value
    public static <E extends Comparable> E compareMaximum(E firstOne, E secOne, E thirdOne) {
        E maximumNumber = firstOne;
        if (secOne.compareTo(maximumNumber) > 0)
            maximumNumber = secOne;
        if (secOne.compareTo(maximumNumber) > 0)
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
        System.out.println("The maximum of three Integers : "
                + compareMaximum(Integer.valueOf(30), Integer.valueOf(40), Integer.valueOf(55)));
        System.out.println("The maximum of three Float Values : "
                + compareMaximum(Float.valueOf(22.43f), Float.valueOf(23.12f), Float.valueOf(43.34f)));
        System.out.println("The Maximum of three String Values :"
        +compareMaximum("Sunil","abcd","xyz"));
    }
}
