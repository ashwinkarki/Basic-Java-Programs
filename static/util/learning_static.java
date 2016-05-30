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
public class learning_static {
    public static void main(String args[])
    {
        Student ashwin=new Student();
        System.out.println(ashwin.noofstudent());//count==1 when called by first instance
        Student karki=new Student();
        System.out.println(karki.noofstudent());//count==2 when called by second instance
        System.out.println(Student.noofstudent()); //when it is called by class count=2
    }
}
