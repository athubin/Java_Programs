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

    void dispPerson() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
    }
}

// Teacher class demonstrating method overriding
class Teacher extends Person {
    String sub;

    // Overridden method
    public void readPerson() {
        super.readPerson();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter subject: ");
        sub = s.nextLine();
    }

    // Overridden method
    public void dispPerson() {
        super.dispPerson();
        System.out.println("Subject: " + sub);
    }
}

class Override {
    public static void main(String args[]) {
        Person p = new Person();
        Teacher t = new Teacher();

        System.out.println("\nDemonstration of Method Overriding");
        System.out.println("---------------------------------\n");

        System.out.println("Enter Person Details");
        System.out.println("--------------------");
        p.readPerson();

        System.out.println("\nEnter Teacher Details");
        System.out.println("---------------------");
        t.readPerson();

        System.out.println("\nPerson Details");
        System.out.println("--------------");
        p.dispPerson();

        System.out.println("\nTeacher Details");
        System.out.println("---------------");
        t.dispPerson();
    }
}
