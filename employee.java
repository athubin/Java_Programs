import java.util.Scanner;

class employeeDetails {
    int eno;
    String ename;
    double esal;

    // Function to read employee details
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        esal = sc.nextDouble();
    }

    // Function to display employee details
    void display() {
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name   : " + ename);
        System.out.println("Employee Salary : " + esal);
        System.out.println("\n");
    }

    // Function to compare employee number
    boolean compareEno(int searchEno) {
        return eno == searchEno;
    }
}

class employee {
    public static void main(String args[]) {
        int n,i;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEmployee Details");
        System.out.println("----------------");

        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        employeeDetails emp[] = new employeeDetails[n];

        // Reading employee details
        for (i = 0; i < n; i++) {
            emp[i] = new employeeDetails();
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].read();
        }

        // Displaying employee details
        System.out.println("\nEmployee Details");
        for (i = 0; i < n; i++) {
            emp[i].display();
        }

        // Searching employee by employee number
        System.out.print("Enter Employee Number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;
        for (i = 0; i < n; i++) {
            if (emp[i].compareEno(searchEno)) {
                System.out.println("\nEmployee Found!");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found!");
        }
    }
}
