// Save this file as Helloword.java
public class Helloword {

    // Instance variable
    private String message;

    // Constructor
    public Helloword(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }

    // Setter method
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to print the message multiple times
    public void printMessage(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + ": " + message);
        }
    }

    // A static utility method
    public static String decorate(String msg) {
        return "**********\n" + msg + "\n**********";
    }

    // Main method
    public static void main(String[] args) {
        // Create an object with "Hello World"
        Helloword hw = new Helloword("Hello World");

        // Print original message
        System.out.println("Original message: " + hw.getMessage());

        // Change the message using setter
        hw.setMessage("Hello World from Java Program");

        // Print the message multiple times
        hw.printMessage(3);

        // Use the static decorate method
        String decorated = Helloword.decorate(hw.getMessage());
        System.out.println(decorated);

        // Show a simple loop printing characters of the message
        System.out.println("Characters in the message:");
        for (char c : hw.getMessage().toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Finish
        System.out.println("Program finished successfully!");
    }
}
