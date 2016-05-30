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
public class constructor {
    public static void main(String args[])
    {
        Cube cube1=new Cube();
        System.out.println(cube1.getvolume());
        
        Cube cube2=new Cube(20,20,20);
          System.out.println(cube2.getvolume());
    }
    
}
