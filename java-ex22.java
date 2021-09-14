/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int largest = 0;
        int finalNum = 0;

        System.out.println("Enter the first number:");
        int firstNum = myObj.nextInt();

        System.out.println("Enter the second number:");
        int secondNum = myObj.nextInt();

        if(secondNum > firstNum){
            largest = secondNum;
        } else {
            largest = firstNum;
        }

        System.out.println("Enter the third number:");
        int thirdNum = myObj.nextInt();

        if (thirdNum > largest) {
            finalNum = thirdNum;
        } else {
            finalNum = largest;
        }

        System.out.println("The largest number is " + finalNum + ".");

        myObj.close();
    }
}