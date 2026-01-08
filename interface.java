//Program to implement run-time polymorphism in Java(interface).  

import java.io.*;
import java.util.*;

interface employee{              // interface creation
    void read();
    void display();
}

class employeeDetails implements employee{          // class implementing interface
    int eno,esal;
    String ename;

    public void read(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        ename = s.nextLine();
        System.out.print("Enter employee number: ");
        eno = s.nextInt();
        System.out.print("Enter salary: ");
        esal = s.nextInt();
    }
    public void display(){
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Salary: " + esal);
    }
}

class employeeMain{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("\nRun time Polymorphism using Interface");
        System.out.println("-------------------------------------");   
        System.out.print("\nEnter number of employees: ");
        int n = s.nextInt();
        employee emp[] = new employee[n];            // array of interface type
        for(int i=0;i<n;i++){
            emp[i] = new employeeDetails();         // object of class implementing interface
            System.out.println("\nEnter details of employee " + (i+1) + ":");
            emp[i].read();
        }
        System.out.println("\nEmployee Details:");
        System.out.println("-----------------");
        for(int i=0;i<n;i++){
            emp[i].display();
            System.out.println();
        }
    }
}