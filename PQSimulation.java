//Implement Printer Queue Simulation without synchronization sing multiple threads 

class PrinterQueue implements Runnable {        // Implementing Runnable Interface

    String name;   

    public PrinterQueue(String name) {          // Constructor
        this.name = name;
    }

    public void run() {                         // Overriding run() method
        System.out.println(name + " is trying to print a document.");
        printDocument();   
        System.out.println(name + " has finished printing the document.");
    }

    public void printDocument() {              // Simulating document printing
        try {
            Thread.sleep(2000);                 // Fixed delay (2 seconds)
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class PQSimulation {

    public static void main(String[] args) {

        System.out.println("\nPrinter Queue Simulation without Synchronization");
        System.out.println("------------------------------------------------\n");

        // Create threads for different users
        Thread user1 = new Thread(new PrinterQueue("User 1"));
        Thread user2 = new Thread(new PrinterQueue("User 2"));
        Thread user3 = new Thread(new PrinterQueue("User 3"));

        // Start all threads
        user1.start();
        user2.start();
        user3.start();
    }
}
