/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arunima.div;

import com.arunima.percen.percentage;

/**
 *
 * @author Telus
 */
public class division {

    public division() {
    }
    

    public void div(double a, double b, double c, double d) {
        percentage p1 = new percentage();
        double div = p1.percen(a, b, c, d);
        if (div >= 40 && div < 49) {
            System.out.println("third division");
        } else if (div >= 50 && div < 59) {
            System.out.println("Second Division");
        } else if (div >= 60 && div <= 79) {
            System.out.println("First Division");
        } else {
            System.out.println("Distinction");
        }

    }
}

