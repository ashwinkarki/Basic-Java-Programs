 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arunima.util;

import com.arunima.m.marks;
import java.util.Scanner;

/**
 *
 * @author Telus
 */

public class Result {

    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {
        //int total=0;
        System.out.println("\t \t Arunima Higher Secondary School");
        System.out.println("\t \t \t Boudha,Tushal");
        System.out.println("Enter the first name of student");
        Scanner s=new Scanner(System.in);
        String firstName=s.nextLine();
        System.out.println("Enter the last name of student");
        String lastName=s.nextLine();
        System.out.println("Enter the symbol number of student");
        int symbol=s.nextInt();
        marks a=new marks();
       a.ma();
        //System.out.println(total);
        
        
    }
    
}
