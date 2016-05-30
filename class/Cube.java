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
public class Cube {
    int length,breadth,height;
    Cube()
    {
        length=0;
        breadth=0;
        height=10;
    }
    Cube(int l,int b,int h)
    {
    length=l;
    breadth=b;
    height=h;
    }
    public int getvolume()
    {
    return(length*breadth*height);
}}
