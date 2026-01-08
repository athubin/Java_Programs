import java.util.*;

// User Defined Exception class
class UDE extends Exception {
    String strError;

    public UDE() {
        strError = "Unknown Error";
    }

    public UDE(String s) {
        strError = s;
    }

    public String showError() {
        return strError;
    }
}

// Class to read and validate password
class readVal {
    String password;

    public void readPassword(Scanner sc) {
        System.out.print("Enter password: ");
        password = sc.nextLine();
    }

    public void validatePassword() throws UDE {           // method to validate password

        if (password.length() < 8)
            throw new UDE("Error: Password must be at least 8 characters long");

        else if (!password.matches(".*[A-Z].*"))
            throw new UDE("Error: Password must contain at least one uppercase letter");

        else if (!password.matches(".*[a-z].*"))
            throw new UDE("Error: Password must contain at least one lowercase letter");

        else if (!password.matches(".*[@*!{}()\\[\\]=].*"))
            throw new UDE("Error: Password must contain at least one special character (@, *, !, {, }, (, ), [, ], =)");

        else if (!password.matches("[A-Za-z0-9@*!{}()\\[\\]=]+"))
            throw new UDE("Error: Password contains invalid characters");

        else if (password.matches(".*(.)\\1{1,}.*"))
            throw new UDE("Error: Password must not contain consecutive repeating characters");

        else
            System.out.println("Password is valid");
    }
}

class Mpassword {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        readVal rv = new readVal();

        System.out.println("\nPassword Validation using User Defined Exception");
        System.out.println("------------------------------------------------");

        // Loop until valid password is entered
        while (true) {
            try {
                rv.readPassword(sc);
                rv.validatePassword();
                break;   // exit loop only if password is valid
            }
            catch (UDE e) {
                System.out.println(e.showError());
                System.out.println("Please try again.\n");
            }
        }

        sc.close();
    }
}
