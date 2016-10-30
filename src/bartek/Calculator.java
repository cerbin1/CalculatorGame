package bartek;

import bartek.operation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Calculator {
    final static private Scanner scanner = new Scanner(System.in);
    private List<Operation> operations = new ArrayList<>();

    void run() {
        Player player = new Player();
        operations.add(new Addition());
        operations.add(new Substraction());
        operations.add(new Power());
        operations.add(new Multiplication());

        Display display = new Display(player, scanner, operations);

        player.setName(display.askForName());

        display.displayHelloMessage();
        display.displayInstructions();

        Difficulty userDifficulty = display.askForDifficultyLevel();

        int level = userDifficulty.getLevel();
        System.out.println(userDifficulty.getDescription());

        display.displayMenu();
        display.askForMenuChoice();

        Operation operation = getOperation();

        for (int i = 1; i <= 10; i++) {
            int first = (int) (Math.random() * level) + 1;
            int second = (int) (Math.random() * level) + 1;

            display.displayQuestion(i, first, second, operation.getChar());
            display.askForAnswer();

            if (Objects.equals(scanner.nextLine(), Float.toString(operation.getResult(first, second)))) {
                display.goodAnswer();
                player.addPoint();
            } else {
                display.wrongAnswer();
            }
        }

        display.displayScore();
        display.displayEndMessage();
    }

    private Operation getOperation() {
        while (true) {
            try {
                String userInput = scanner.nextLine();
                int choice = Integer.parseInt(userInput);
                return operations.get(choice - 1);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.err.println("Podales zly number. Sprobuj ponownie.");
            }
        }
    }
}
