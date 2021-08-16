package com.bridgelabz;

/**
 * purpose - To simulate Generics Method
 * MaxOf#Integers implements an application that
 * gererates max. of three Integer value
 * @author  Sunil
 * @version  16.0
 * @since 16/08/2021
 */
public class MaxOf3Integers {
    // used Integer object and compareTo To test MaximumNumber
    public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber = firstNumber;
        if (secondNumber.compareTo(maximumNumber)>0)
            maximumNumber = secondNumber;
        if (thirdNumber.compareTo(maximumNumber)>0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }
    //declered MAin Method
    public static void main(String[] args) {
        System.out.printf("the Maximum value of three Integers :\n " +compareIntegerMaximum(55,40,50));
    }

}
