/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.overriding;

/**
 *
 * @author Telus
 */
public class Overriding {
    public static void main(String args[])
    {
        Bank abc=new nabil();
        Bank def=new Bank();
        System.out.println(abc.gett());
        System.out.println(def.gett());
    }
    
}
