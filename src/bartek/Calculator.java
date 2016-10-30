package bartek;

import java.util.Objects;
import java.util.Scanner;

class Calculator {
    final static private Scanner scanner = new Scanner(System.in);
    private boolean usersMenuChoiceWrong = true;

    void run() {
        Player player = new Player();
        Display display = new Display(player, scanner);

        player.setName(display.askForName());

        display.displayHelloMessage();
        display.displayInstructions();

        Difficulty userDifficulty = display.askForDifficultyLevel();
        player.setDifficulty(userDifficulty);

        int level = userDifficulty.getLevel();
        System.out.println(userDifficulty.getDescription());

        // TODO usersMenuChoiceWrong do wyjebania
        // TODO flagi są chujowe, a usersMenuChoiceWrong jest flagą

        while (usersMenuChoiceWrong) {
            try {
                display.displayMenu(); // TODO to
                display.askForMenuChoice(); // TODO i to powinno być poza tryem (bo te dwie linijki nie rzucą wyjątku)
                String usersChoice = scanner.nextLine();
                player.setMenuChoice(Integer.parseInt(usersChoice)); // TODO menu choice powinno być enumem
            } catch (NumberFormatException e) {
                System.err.println("Wrong number!");
            }
            switch (player.getMenuChoice()) { // TODO zadanie na skype
                case 1:
                    int firstNumber;
                    int secondNumber;
                    for (int i = 1; i <= 11; i++) {
                        firstNumber = (int) (Math.random() * level) + 1;
                        secondNumber = (int) (Math.random() * level) + 1;

                        display.displayQuestion(i, firstNumber, secondNumber, '+');
                        display.askForAnswer();

                        if (Objects.equals(scanner.nextLine(), Integer.toString(firstNumber + secondNumber))) {
                            display.goodAnswer();
                            player.addPoint();
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
                case 2:
                    for (int i = 1; i <= 11; i++) {
                        firstNumber = (int) (Math.random() * level) + 1;
                        secondNumber = (int) (Math.random() * level) + 1;

                        System.out.println(Integer.toString(firstNumber - secondNumber));
                        display.displayQuestion(i, firstNumber, secondNumber, '-');
                        display.askForAnswer();


                        if (Objects.equals(scanner.nextLine(), Integer.toString(firstNumber - secondNumber))) {
                            display.goodAnswer();
                            player.addPoint();
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
                case 3:
                    for (int i = 1; i <= 11; i++) {
                        firstNumber = (int) (Math.random() * level) + 1;
                        secondNumber = (int) (Math.random() * level) + 1;

                        display.displayQuestion(i, firstNumber, secondNumber, '*');
                        display.askForAnswer();

                        if (Objects.equals(scanner.nextLine(), Integer.toString(firstNumber * secondNumber))) {
                            display.goodAnswer();
                            player.addPoint();
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
                case 4:
                    for (int i = 1; i <= 11; i++) {
                        firstNumber = (int) (Math.random() * level) + 1;
                        secondNumber = (int) (Math.random() * level) + 1;

                        display.displayQuestion(i, firstNumber, secondNumber, '^');
                        display.askForAnswer();

                        if (Objects.equals(scanner.nextLine(), Double.toString(Math.pow(firstNumber, secondNumber)))) {
                            display.goodAnswer();
                            player.addPoint();
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
                case 5:
                    for (int i = 1; i <= 11; i++) {
                        firstNumber = (int) (Math.random() * level) + 1;
                        secondNumber = (int) (Math.random() * level) + 1;

                        display.displayQuestion(i, firstNumber, secondNumber, '/');
                        display.askForAnswer();

                        if (Objects.equals(scanner.nextLine(), Integer.toString(firstNumber / secondNumber))) {
                            display.goodAnswer();
                            player.addPoint();
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
                default:
                    System.out.println("You chose wrong option. Try to type it again.");
            }
        }
        display.displayScore();
        display.displayEndMessage();
    }
}
