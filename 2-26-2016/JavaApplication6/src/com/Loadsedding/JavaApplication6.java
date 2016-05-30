/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Loadsedding;

/**
 *
 * @author Telus
 */
import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char abc;
        
        System.out.println("\t \t Welcome to Nepal Loadshedding");
        
         System.out.println("\t  \t \t Group Available");
          System.out.println("\t Group1 \t Group2 \t Group3 \t Group4");
          
           
           Scanner num=new Scanner(System.in);
          System.out.println("Plz Enter the group");
          int group=num.nextInt();
              switch (group)  
           {
               case 1:
                    System.out.println("The time Below shown is line to be cutoff");
         System.out.println("Sunday: \t 9:00 to 15:00");
         System.out.println(" \t \t 6:00 to 3:00");
            
              System.out.println("\n Monday: \t 2:00 to 4:00");
              System.out.println("\t \t 8:00 to 10:00"); 
           
              System.out.println("\n Tuesday: \t 1:00 to 6:00");
           System.out.println(" \t \t 12:00 to 2:00");
            
              System.out.println("\n Wednesday: \t 6:00 to 8:00");
              System.out.println(" \t \t 9:00 to 10:00"); 
               
              System.out.println("\n Thursday: \t 4:00 to 8:00");
              System.out.println(" \t \t 9:00 to 11:00"); 
              
              System.out.println("\n Friday: \t 3:00 to 4:00");
              System.out.println(" \t \t 6:00 to 2:00"); 
              
              System.out.println("\n Saturday: \t 1:00 to 2:00");
              System.out.println(" \t \t 3:00 to 4:00"); 
              break;
         
               case 2:
                     System.out.println("The time Below shown is line to be cutoff");
         System.out.println("Sunday: \t 8:00 to 14:00");
         System.out.println(" \t \t 7:00 to 4:00");
            
              System.out.println("\n Monday: \t 3:00 to 5:00");
              System.out.println("\t \t 9:00 to 11:00"); 
           
              System.out.println("\n Tuesday: \t 2:00 to 7:00");
           System.out.println(" \t \t 1:00 to 3:00");
            
              System.out.println("\n Wednesday: \t 7:00 to 9:00");
              System.out.println(" \t \t 10:00 to 11:00"); 
               
              System.out.println("\n Thursday: \t 5:00 to 9:00");
              System.out.println(" \t \t 20:00 to 11:00"); 
              
              System.out.println("\n Friday: \t 3:00 to 4:00");
              System.out.println(" \t \t 7:00 to 2:00"); 
              
              System.out.println("\n Saturday: \t 1:00 to 2:00");
              System.out.println(" \t \t 3:00 to 4:00"); 
           break;
         case 3:
                     System.out.println("The time Below shown is line to be cutoff");
         System.out.println("Sunday: \t 9:00 to 16:00");
         System.out.println(" \t \t 8:00 to 5:00");
            
              System.out.println("\n Monday: \t 4:00 to 6:00");
              System.out.println("\t \t 10:00 to 12:00"); 
           
              System.out.println("\n Tuesday: \t 3:00 to 8:00");
           System.out.println(" \t \t 2:00 to 4:00");
            
              System.out.println("\n Wednesday: \t 8:00 to 10:00");
              System.out.println(" \t \t 11:00 to 12:00"); 
               
              System.out.println("\n Thursday: \t 6:00 to 10:00");
              System.out.println(" \t \t 21:00 to 12:00"); 
              
              System.out.println("\n Friday: \t 5:00 to 4:00");
              System.out.println(" \t \t 8:00 to 3:00"); 
              
              System.out.println("\n Saturday: \t 2:00 to 3:00");
              System.out.println(" \t \t 4:00 to 5:00"); 
           break;
         case 4:
                     System.out.println("The time Below shown is line to be cutoff");
         System.out.println("Sunday: \t 10:00 to 17:00");
         System.out.println(" \t \t 9:00 to 6:00");
            
              System.out.println("\n Monday: \t 5:00 to 7:00");
              System.out.println("\t \t 11:00 to 13:00"); 
           
              System.out.println("\n Tuesday: \t 4:00 to 9:00");
           System.out.println(" \t \t 3:00 to 5:00");
            
              System.out.println("\n Wednesday: \t 9:00 to 11:00");
              System.out.println(" \t \t 12:00 to 13:00"); 
               
              System.out.println("\n Thursday: \t 7:00 to 11:00");
              System.out.println(" \t \t 22:00 to 13:00"); 
              
              System.out.println("\n Friday: \t 6:00 to 5:00");
              System.out.println(" \t \t 9:00 to 4:00"); 
              
              System.out.println("\n Saturday: \t 3:00 to 4:00");
              System.out.println(" \t \t 5:00 to 6:00"); 
         
                break;
         
          default:
                   
          System.out.println("Sorry the group is invalid");
         
             break; 
           }
              
           
    }
    
}
