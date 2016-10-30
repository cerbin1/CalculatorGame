package bartek;

import bartek.operation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Calculator {
    final static private Scanner scanner = new Scanner(System.in);

    void run() {
        Player player = new Player();
        List<Operation> operations = new ArrayList<>();
        operations.add(new Addition());
        operations.add(new Substraction());
        operations.add(new Power());
        operations.add(new Multiplication());

        Display display = new Display(player, scanner, operations);
        Operation operation = null;

        player.setName(display.askForName());

        display.displayHelloMessage();
        display.displayInstructions();

        Difficulty userDifficulty = display.askForDifficultyLevel();
        player.setDifficulty(userDifficulty);

        int level = userDifficulty.getLevel();
        System.out.println(userDifficulty.getDescription());

        // TODO usersMenuChoiceWrong do wyjebania
        // TODO flagi są chujowe, a usersMenuChoiceWrong jest flagą

        try {
            display.displayMenu(); // TODO to
            display.askForMenuChoice(); // TODO i to powinno być poza tryem (bo te dwie linijki nie rzucą wyjątku)
            String usersChoice = scanner.nextLine();
            operation = operations.get(Integer.parseInt(usersChoice) - 1);
        } catch (NumberFormatException e) {
            System.err.println("Wrong number!");
        }

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
}
