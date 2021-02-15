package com.company;

import java.sql.SQLClientInfoException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {20,4,67,9,0};

        reverse(myArray);
    }



    private static void reverse(int[] myArray){
        System.out.println("Array = " + Arrays.toString(myArray));
        System.out.println();
        int[] reverseMyArray = new int[myArray.length];
        int k = 0;
        for(int i = myArray.length-1; i >= 0; i--) {
            reverseMyArray[k] = myArray[i];
            k++;
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseMyArray));
    }
}