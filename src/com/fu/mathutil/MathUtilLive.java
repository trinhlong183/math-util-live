/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        long result = MathUtil.getFactorial(5);
        System.out.println("Expected:5! = 120, Actual: " + result);
        System.out.println("Expected:1! = 1 ,  Actual: " + MathUtil.getFactorial(1));
//        MathUtil.getFactorial(-1);
    }
    
}
