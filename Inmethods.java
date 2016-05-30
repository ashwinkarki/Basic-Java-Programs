/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.util;

/**
 *
 * @author Telus
 */
import java.util.Scanner;
public class Inmethods {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter some integer number");
         int ap=scan.nextInt();
        System.out.println("The entered integer number is \t" +ap);
        
        
         System.out.println("Enter some double number");
         double ak=scan.nextDouble();
        System.out.println("The entered double number is \t" +ak);
         
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter some String");
        String sg=scan1.nextLine();
        System.out.print("The entered String is \t" +sg);
        
    }
}
