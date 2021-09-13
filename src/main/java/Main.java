/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();

        System.out.println(euros+" euros at an exchange rate of " +rate+ " is: ");

        double dollars= rate * euros;
        System.out.printf("%.2f U.S. dollars", dollars);



    }
}
