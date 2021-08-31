package org.example;
import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 6 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is your current age? " );
        String age = scan.nextLine();
        System.out.print( "At what age would you like to retire? " );
        String retire = scan.nextLine();
        int ageint=Integer.parseInt(age);
        int retireint=Integer.parseInt(retire);
        int total = retireint - ageint;
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int totalyear = year + ageint;
        System.out.println("You have "+total+" years left until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+totalyear+".");
    }
}