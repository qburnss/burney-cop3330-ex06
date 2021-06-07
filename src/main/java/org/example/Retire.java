/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Calendar;
import java.util.Scanner;


import static java.lang.Integer.*;

public class Retire {
    public static void main(String[] args){
        int theage, rage, getout=0;
        System.out.println("What is your current age");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.next();
        System.out.println("At what age would you like to retire?");
        Scanner scanner1 = new Scanner(System.in);
        String retireAge = scanner1.next();

            theage = parseInt(age);
            rage = parseInt(retireAge);
            getout = rage - theage;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireyear = year + getout;
       System.out.println("You have " + getout + " years until you can retire.");
       System.out.println("It is " + year + " so you can retire in " + retireyear);
    }
}
