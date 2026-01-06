import java.util.Scanner;

// Person class
class Person {
    int age;
    String name;

    void readPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Address class (used for HAS-A)
class Address {
    String city;

    void readAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city: ");
        city = sc.nextLine();
    }

    void displayAddress() {
        System.out.println("City: " + city);
    }
}

// Teacher class (IS-A Person and HAS-A Address)
class Teacher extends Person {
    String subject;
    Address addr;   // HAS-A relationship

    Teacher() {
        addr = new Address();
    }

    void readTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
        addr.readAddress();
    }

    void displayTeacher() {
        System.out.println("Subject: " + subject);
        addr.displayAddress();
    }
}

class INH {
    public static void main(String[] args) {
        Teacher t = new Teacher();

	System.out.println("\nISA and HASA Relationship");
	System.out.println("-------------------------\n");

        t.readPerson();    // IS-A
        t.readTeacher();   // HAS-A

        System.out.println("\n--- Teacher Details ---");
        t.displayPerson();
        t.displayTeacher();
    }
}
