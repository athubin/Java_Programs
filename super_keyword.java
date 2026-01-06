import java.util.*;

// Base class
class Person {
    int age;

    // Base class constructor
    Person(int a) {
        age = a;
        System.out.println("Age: " + age);
    }

    // Base class method
    void display() {
        System.out.println("Display Method of Person class (Base)");
    }
}

// Derived class
class Teacher extends Person {
    String subject;

    // Derived class constructor
    Teacher(int a, String s) {
        super(a);   // Passing argument to base class constructor
        subject = s;
        System.out.println("Subject: " + subject);
    }

    // Overridden method
    void display() {
        super.display();  // Overcoming function overriding
        System.out.println("Display Method of Teacher class (Derived)");
    }
}

// Main class
class SuperDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\nSUPER KEYWORD DEMONSTRATION");
        System.out.println("---------------------------");

        while(true) {
            System.out.println("\nMENU");
            System.out.println("1. Passing arguments to base class constructor");
            System.out.println("2. Overcoming function overriding");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nDemonstrating super() to pass arguments");
                    Teacher t1 = new Teacher(40, "Java");
                    break;

                case 2:
                    System.out.println("\nDemonstrating super to overcome overriding");
                    Teacher t2 = new Teacher(35, "Python");
                    System.out.println();
                    t2.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
