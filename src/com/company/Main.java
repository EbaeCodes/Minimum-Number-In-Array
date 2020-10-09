 package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

	// write your code here

        int[] myArray = readInteger(5);


        System.out.println("the minimum value is" +   findMin(myArray) );
    }




    private static int[] readInteger(int count){
        // this create an array of 5  integer
        int[] array = new int[count];
        System.out.println("Enter only" + count + "integers");
        for (int i = 0; i < array.length; i++){
            array[i] =  scanner.nextInt();
        }
     return array;
    }



    private static int findMin(int[] array){

        int minValue = Integer.MAX_VALUE;
        for(int i= 0; i< array.length;i++){
            int value = array[i];
            System.out.println("the values is"+ value);

            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }




}
