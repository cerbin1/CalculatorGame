public class Display {
    Player player = new Player();

    void askForName() {
        System.out.println("Hello, what is your namne?");
    }

    void displayHelloMessage(String name) {
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

    void askForMenuChoice() {

    }

    void displayQuestion() {
        //TODO
    }

    void displayScore() {
        //TODO
    }

    void displayEndMessage(String name) {
        System.out.println("Bye " + name);
    }
}
