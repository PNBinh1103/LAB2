/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Student
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q3_LAB2b_Company {
    private int basicSalary;
    private ArrayList<Q3_LAB2c_Employee> employees;
    private static Scanner sc = new Scanner(System.in);

    public Q3_LAB2b_Company(int basicSalary) {
        employees = new ArrayList<>();
        this.basicSalary = basicSalary;
    }
    public Q3_LAB2b_Company(){
        employees = new ArrayList<>();
    }

    public void inputEmployees(){
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Q3_LAB2c_Employee newEmployee = new Q3_LAB2c_Employee();
            newEmployee.setBasicSalary(this.basicSalary);
            newEmployee.input();
            employees.add(newEmployee);
        }
    }
    public void printSalarySheet(){
        System.out.println("Printing Salary Sheet");
        for (Q3_LAB2c_Employee employee : employees) {
            employee.printSalary();
        }
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void printEmployeesBySalary(){
        employees.sort(new Comparator<Q3_LAB2c_Employee>() {
            @Override
            public int compare(Q3_LAB2c_Employee e1, Q3_LAB2c_Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        // Print out sorted employees
        System.out.println("Sorting by descending Salary");
        for (Q3_LAB2c_Employee employee : employees) {
            System.out.println("Employee name: " + employee.getName() + " | Salary: " + employee.getSalary());
        }
    }
    public void highestSalaryEmployee(){
        employees.sort(new Comparator<Q3_LAB2c_Employee>() {
            @Override
            public int compare(Q3_LAB2c_Employee e1, Q3_LAB2c_Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        System.out.println("Employee with highest Salary: " + employees.get(0).getName() + " | Salary: " + employees.get(0).getSalary());
    }

}
