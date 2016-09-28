public class Display {

    void askForName() {
        System.out.println("Hello, what is your namne?");
    }

    void displayHelloMessage(Player p) {
        System.out.println("Hello " + p.getName());
    }

    void displayInstructions() {
        System.out.println("DisplayInstructions"); //TODO display Instructions
    }

    void displayMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    void askForMenuChoice() {
        System.out.print("Your choice: ");
    }

    void askForDifficultyLevel() {
        System.out.println("Which difficulty do you choose?");
        System.out.println("1. - Max one-digit operations");
        System.out.println("2. - Max two-digits operations");
        System.out.println("3. - Max three-digits operations");
        System.out.print("Your choice: ");

    }

    void displayQuestion(int index, int first, int second, char operative) {
        System.out.println(index + " operation: " + first + " " + operative + " " + second + " = ?");
    }

    void askForAnswer() {
        System.out.print("Your answer: ");
    }

    void goodAnswer() {
        System.out.println("Good answer! Plus 1 point.");
    }

    void wrongAnswer() {
        System.out.println("Wrong answer! Unfortunately you don't get a point :/.");
    }

    void displayScore(Player p) {
        System.out.println("You achieved " + p.getScore() + " points.");
    }

    void displayEndMessage(String name) {
        System.out.println("Bye " + name);
    }
}
