/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.*;

/**
 *
 * @author admin
 */
public class Q1_LAB2 {

    private double re;
    private double im;

    public Q1_LAB2() {
    }

    public Q1_LAB2(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

 //   public void input() {
        // public static main void(String[]args){

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the first complex number: ");
//        double re1 = sc.nextDouble();
//        double im1 = sc.nextDouble();
//
//        System.out.print("enter the second complex number: ");
//        double re2 = sc.nextDouble();
//        double im2 = sc.nextDouble();
          
    

    public void output() {
        System.out.print("\nresult: "+ this.re + this.im +  "i");

    }

    public Q1_LAB2 Plus(Q1_LAB2 cp1) {
        double resultRe = this.re + cp1.getRe();
        double resultIm = this.im + cp1.getRe();
        return new Q1_LAB2(resultIm, resultRe);

    }
}