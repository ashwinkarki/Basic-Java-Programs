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
public class StringBasic {
    public static void main(String args[])
    {
        String meroString="Ashwin Karki";
        int len=meroString.length(); //gives length of string
        String lower=meroString.toLowerCase();
        String upper=meroString.toUpperCase();
        String ak=meroString.substring(0, 3);
        int ab=meroString.indexOf('s');
        String an=meroString.replace('s', 'd');
        
        System.out.println(len +"\n");
         
        System.out.println(lower +"\n");
         
        System.out.println(upper+"\n");
         
        System.out.println(ak+"\n");
         
        System.out.println(ab +"\n");
         
        System.out.println(an+"\n");
        
        
        
        
        
        
    }
}
