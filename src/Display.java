public class Display {
    public void displayHelloMessage(String name) {
        System.out.println("Hello " + name);
    }

    void displayInstructions() {
        System.out.println("DisplayInstructions"); //TODO display Instructions
    }

    void displayMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Your choice: ");
    }

    void displayQuestion() {
        //TODO
    }
    void displayScore() {

    }
    void displayEndMessage(String name) {
        System.out.println("Bye " + name);
    }
}
