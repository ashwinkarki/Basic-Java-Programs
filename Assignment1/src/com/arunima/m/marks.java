/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arunima.m;

import com.arunima.div.division;
import com.arunima.percen.percentage;
import com.arunima.tot.Total;
import java.util.Scanner;


public class marks {
    public static void ma()
    {
        System.out.println("Enter the marks of student in Science");
        Scanner input=new Scanner(System.in);
        double science=input.nextDouble();
        
        System.out.println("Enter the marks of student in Maths");
        Scanner input1=new Scanner(System.in);
        double maths=input1.nextDouble();
        
        System.out.println("Enter the marks of student in English");
        Scanner input2=new Scanner(System.in);
        double english=input2.nextDouble();
        
        
        System.out.println("Enter the marks of student in Nepali");
        Scanner input3=new Scanner(System.in);
        double nepali=input3.nextDouble();
        
        if (science<32 || maths<32 || english<32 || nepali<32)
        {
            System.out.println("Sorry you are failed");
            Total t=new Total();
            double r=t.totals(science,maths,english,nepali);
            System.out.println("Total"+r);
            System.out.println("Percentage=--");
            System.out.println("Division=--");
                    }
        else
        {
            System.out.println("Congratulations you have passed the exam");
            Total t1=new Total();
            double r=t1.totals(science,maths,english,nepali);
         System.out.println("Total="+r);
            percentage p=new percentage();
         double s=p.percen(science,maths,english,nepali);
            System.out.println("Percentage="+s);
            division d=new division();
            d.div(science,maths,english,nepali);
            
            
            
        }   
    }
}
