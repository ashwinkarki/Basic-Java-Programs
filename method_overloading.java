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

public class method_overloading {
    
    public static void main(String args[])
    {
        System.out.println(math(2,3));  
        System.out.print(math(1,2,3));
        System.out.print(math("Ashwin","Karki"));
    }
public static  int math(int a,int b)
{
return (a+b);
}
public static int math(int a,int b,int c)
{
return (a+b+c);
}
public static  String math(String a,String b)
{
return (a+b);
}
}
