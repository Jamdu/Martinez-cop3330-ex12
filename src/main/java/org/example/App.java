/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */
package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
     Scanner scnr = new Scanner(System.in);

     System.out.println("Enter the principal:");
     int principal = scnr.nextInt();

     System.out.println("Enter the rate of interest");
     double rateOfInterest = scnr.nextDouble();

     System.out.println("Enter the number of years");
     int years = scnr.nextInt();


     double A = principal * (1 + (rateOfInterest / 100) * years);

     System.out.format("After %d years at %.1f%%, the investment will be worth $%.2f.", years, rateOfInterest, A);

    }
}
