/* Create a class for a student having (sno, sname, sprogram). Provide functions for reading and displaying the same 
information. Also provide a function for comparing two student objects for equality. */

import java.io.*;
import java.util.*;

class Student {
    int sno;
    String sname;
    String sprogram;

    // Function to read student details
    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student number: ");
        sno = sc.nextInt();
        sc.nextLine();  // clear newline

        System.out.print("Enter student name: ");
        sname = sc.nextLine();

        System.out.print("Enter student program: ");
        sprogram = sc.nextLine();
    }

    // Function to display student details
    public void display() {
        System.out.println("Student Number : " + sno);
        System.out.println("Student Name   : " + sname);
        System.out.println("Program        : " + sprogram);
    }

    // Function to compare two student objects
    public boolean compare(Student s) {
        return (this.sno == s.sno &&
                this.sname.equals(s.sname) &&
                this.sprogram.equals(s.sprogram));
    }
}

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("\nStudent Details\n-----------------\n");

        System.out.println("Enter details of first student:");
        s1.read();

        System.out.println("\nEnter details of second student:");
        s2.read();

        System.out.println("\nDetails of First Student:");
        s1.display();

        System.out.println("\nDetails of Second Student:");
        s2.display();

        // Compare both students
        if (s1.compare(s2))
            System.out.println("\nBoth students are same.");
        else
            System.out.println("\nStudents are NOT same.");
    }
}
