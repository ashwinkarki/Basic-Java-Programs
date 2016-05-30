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
public class Array {
    public static void main(String args[]){
    int[] myArray={1,5,10,15,17};  //1st method of declaring array
    int myArray2[]={2,3,4,5,7};  //2nd method of declaring array
    int[] myIntArray=new int[3]; //3rd method of declaring array
    int[] myIntArray2={1,2,3}; //4th method of declaring array
    int[] myIntArray3=new int[]{1,2,3}; //5th method of declaring array
    
    int i=0;
    while(i<5)
    {
        System.out.println(myArray[i]);
        i++;
            }
}}
