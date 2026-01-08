/* Create an interface ishape having two prototypes draw and mov, create two classes 
circle and rectangle which implements the above interface. In the main function only 
a reference object of ishape is created, depends on the choice entered by the user , it 
points to the respective memory location.  */

import java.util.*;

interface ishape {
    void draw();
    void mov();
}
class circle implements ishape {
    public void draw() {
        System.out.println("\nInside draw method of circle");
    }
    public void mov() {
        System.out.println("Inside move method of circle");
    }
}

class rectangle implements ishape {
    public void draw() {
        System.out.println("\nInside draw method of rectangle");
    }
    public void mov() {
        System.out.println("Inside move method of rectangle");
    }
}

class shape {
    public static void main(String[] args) {
        ishape s;
        System.out.println("\nRun time Polymorphism using Interface");
        System.out.println("-------------------------------------");    
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:"); 
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s = new circle();
                    s.draw();
                    s.mov();
                    break;

                case 2:
                    s = new rectangle();
                    s.draw();
                    s.mov();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Exiting.");
            }
        }
    }
}
