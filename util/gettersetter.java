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
public class gettersetter {
    public static void main(String args[])
    {
    Student ashwin=new Student();
    ashwin.setId(1);
    ashwin.setName("ashwin");
    ashwin.setRoll(17);
    
    Student hari=new Student();
     hari.setId(2);
    hari.setName("harry");
    hari.setRoll(18);
    
        System.out.println("His id is"+ashwin.getId());
        System.out.println("His Name is"+ashwin.getName());
        System.out.println("His roll is"+ashwin.getRoll());
        
        System.out.println("His id is"+hari.getId());
        System.out.println("His Name is"+hari.getName());
        System.out.println("His roll is"+hari.getRoll());
        
        
    
            }
}
