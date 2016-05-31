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
public class mainclass {
    public static void main(String args[])
    {
        Rectangle rec=new Rectangle();
        rec.set_values(10, 10);
        
        Triangle tri=new Triangle();
        tri.set_values(10, 10);
        
        System.out.println("area of recatngle is"+rec.area());
        System.out.println("area of recatngle is"+tri.area());
        
    }
    
}
