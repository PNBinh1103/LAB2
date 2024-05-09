/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Q3_LAB2c_Employee {
    private String name;
    private String employeeCode;
    private int yearsOfService;
    private double salaryCoefficient;
    private double salary;
    private static Scanner sc = new Scanner(System.in);



    private int basicSalary;

    public Q3_LAB2c_Employee() {
    }

    public Q3_LAB2c_Employee(String name, String employeeCode, int years_of_service, int basicSalary) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.yearsOfService = years_of_service;
    }

    public void input(){
        System.out.println("Employee name: ");
        this.name = sc.nextLine();
        System.out.println("Employee code: ");
        this.employeeCode = sc.nextLine();
        System.out.println("Employee years of service: ");
        this.yearsOfService = sc.nextInt();
        sc.nextLine();
        this.salaryCoefficient = Math.pow(1.10, yearsOfService);
        this.salary = salaryCoefficient * basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public int getYears_of_service() {
        return yearsOfService;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setYears_of_service(int years_of_service) {
        this.yearsOfService = years_of_service;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void printSalary(){
        System.out.println("Employee name: "+name+" | years of service: "+yearsOfService+" | Salary: "+salary);
    }
    public double getSalary(){
        return salary;
    }

}
