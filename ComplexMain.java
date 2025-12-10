/* Create a class complex having real and imaginary as data members and provide 
function for read, display, add and multiply.  */

import java.io.*;
import java.util.*;

class Complex {
    int real, imag;

    // Function to read complex number
    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = s.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = s.nextInt();
    }

    // Function to display complex number
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    // Function to add two complex numbers
    public Complex add(Complex c) {
        Complex t = new Complex();
        t.real = this.real + c.real;
        t.imag = this.imag + c.imag;
        return t;
    }

    // Function to multiply two complex numbers
    public Complex multiply(Complex c) {
        Complex t = new Complex();
        t.real = (this.real * c.real) - (this.imag * c.imag);
        t.imag = (this.real * c.imag) + (this.imag * c.real);
        return t;
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        Complex a = new Complex();
        Complex b = new Complex();

        System.out.println("\nComplex Numbers\n---------------");

        System.out.println("\nEnter first complex number:");
        a.read();

        System.out.println("\nEnter second complex number:");
        b.read();

        System.out.print("\nFirst complex number: ");
        a.display();

        System.out.print("Second complex number: ");
        b.display();

        // Add
        Complex sum = a.add(b);
        System.out.print("\nSum = ");
        sum.display();

        // Multiply
        Complex product = a.multiply(b);
        System.out.print("Product = ");
        product.display();
    }
}
