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

    void displayQuestion(int index, int first, int second) {
        System.out.println(index + " operation: " + first + " + " + second + " = ?");
    }

    void askForAnswer() {
        System.out.print("Your answer: ");
    }

    void goodAnswer() {
        System.out.println("Good answer! Plus 1 point.");
    }

    void wrongAnswer() {
        System.out.println("Wrong answer! Unfortunatelly you don't get a point :/.");
    }

    void displayScore() {
        //TODO
    }

    void displayEndMessage(String name) {
        System.out.println("Bye " + name);
    }
}
