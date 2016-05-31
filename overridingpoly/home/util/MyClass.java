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
public class MyClass {
    public static void main(String args[])
    {
        Bank abc=new Bank_abc();
        
        Bank def=new Bank_def();
        Bank xyz=new Bank_ghi();
        
        System.out.println(abc.InterestRate());
        System.out.println(def.InterestRate());
        System.out.println(xyz.InterestRate());
        
        
    }
}
