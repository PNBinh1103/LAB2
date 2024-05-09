/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Q1_LAB2 {
    private double re;
    private double im;
    public double getRe() {
        return re;
    }
    public void setRe(double re) {
        this.re = re;
    }
    public double getIm() {
        return im;
    }
    public void setIm(double im) {
        this.im = im;
    }
    
    public Q1_LAB2(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Q1_LAB2() {
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter re: ");
        re = sc.nextDouble();
        System.out.print("Enter im: ");
        im = sc.nextDouble();
    }
    public void output() {
        System.out.println(re+" +"+im+"i");
    }
    public Q1_LAB2 addition(Q1_LAB2 c1){
    double resultRe = this.re+c1.getRe();
    double resultIm = this.im+c1.getIm();
    return new Q1_LAB2(resultRe, resultIm);
    }
     public Q1_LAB2 subtraction(Q1_LAB2 c1){
     double resultRe = this.re-c1.getRe();
    double resultIm = this.im-c1.getIm();
    return new Q1_LAB2(resultRe, resultIm);
    }
    public Q1_LAB2 multiplication(Q1_LAB2 c1){
     double resultRe = this.re*c1.getRe();
    double resultIm = this.im*c1.getIm();
    return new Q1_LAB2(resultRe, resultIm);
    }
    public Q1_LAB2 division(Q1_LAB2 c1){
     double resultRe = this.re/c1.getRe();
    double resultIm = this.im/c1.getIm();
    return new Q1_LAB2(resultRe, resultIm);
    }
    
}
