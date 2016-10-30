package bartek;

import bartek.operation.Operation;

import java.util.List;
import java.util.Scanner;

// TODO w klasie Display metody które zaczynają się od ask powinny w środu robić scanner.nextLine() i zwracać to co ktoś wpisał.
class Display {
    private final Player player;
    private final Scanner scanner;
    private List<Operation> operations;

    Display(Player player, Scanner scanner, List<Operation> operations) {
        this.player = player;
        this.scanner = scanner;
        this.operations = operations;
    }

    String askForName() {
        System.out.println("Hello, what is your name?");
        while (true) {
            String input = scanner.nextLine();
            if (input.length() >= 3) {
                return input;
            }
            System.out.println("Your name is too short. Try type it again.");
        }
    }

    void displayHelloMessage() {
        System.out.println("Hello " + player.getName());
    }

    void displayInstructions() {
        System.out.println("You will have to choose the difficulty of the game and then choose which operations do you want to do.");
    }

    void displayMenu() {
        System.out.println("Now choose what you want to do:");
        for (Operation operation : this.operations) {
            System.out.println(operation.getName());
        }
    }

    void askForMenuChoice() {
        System.out.print("Your choice: ");
    }

    Difficulty askForDifficultyLevel() {
        displayDifficulties();
        System.out.print("Your choice: ");
        String string = scanner.nextLine();
        string = string.toUpperCase();
        return Difficulty.valueOf(string);
    }

    private void displayDifficulties() {
        System.out.println("Which difficulty do you choose?");
        System.out.println("'easy' - Max one-digit operations");
        System.out.println("'medium' - Max two-digits operations");
        System.out.println("'hard' - Max three-digits operations");
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

    void displayScore() {
        System.out.println("You achieved " + player.getScore() + "/10 points.");
    }

    void displayEndMessage() {
        System.out.println("Bye " + player.getName() + ".");
    }
}