package bartek;

import java.util.Objects;
import java.util.Scanner;

import static bartek.Difficulty.*;

class Calculator {

    final static private Scanner scanner = new Scanner(System.in);

    private boolean usersMenuChoiceWrong = true;


    void run() {

        Player player = new Player();
        Display display = new Display(player, scanner);


        display.askForName();


        while (true) {
            player.setName(scanner.nextLine());
            if (player.getName().length() < 3) {
                System.out.println("Your name is too short. Try type it again.");
            } else {
                break;
            }
        }

        display.displayHelloMessage();
        display.displayInstructions();


        player.setDifficulty(display.askForDifficultyLevel());

        int difficulty;
        while (true) {
            if (player.getDifficulty() == EASY) {
                System.out.println("You choosed easy level.");
                difficulty = 10;
                break;
            } else if (player.getDifficulty() == MEDIUM) {
                System.out.println("You choosed medium level.");
                difficulty = 100;
                break;
            } else if (player.getDifficulty() == HARD) {
                System.out.println("You choosed hard level.");
                difficulty = 1000;
                break;
            } else {
                System.err.println("Wrong option. Try to type it once more.");
                player.setDifficulty(display.askForDifficultyLevel());
            }
        }

        display.displayMenu();
        display.askForMenuChoice();
        while (usersMenuChoiceWrong) {
            try {
                String usersChoice = scanner.nextLine();
                player.setMenuChoice(Integer.parseInt(usersChoice));
            } catch (NumberFormatException e) {
                System.err.println("Wrong number!");
            }
            switch (player.getMenuChoice()) {
                case 1:
                    int firstNumber;
                    int secondNumber;
                    for (int i = 1; i <= 10; i++) {
                        firstNumber = (int) (Math.random() * difficulty) + 1;
                        secondNumber = (int) (Math.random() * difficulty) + 1;

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
                    for (int i = 1; i <= 10; i++) {
                        firstNumber = (int) (Math.random() * difficulty) + 1;
                        secondNumber = (int) (Math.random() * difficulty) + 1;

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
                    for (int i = 1; i <= 10; i++) {
                        firstNumber = (int) (Math.random() * difficulty) + 1;
                        secondNumber = (int) (Math.random() * difficulty) + 1;

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
                    for (int i = 1; i <= 10; i++) {
                        firstNumber = (int) (Math.random() * difficulty) + 1;
                        secondNumber = (int) (Math.random() * difficulty) + 1;

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
            }
        }
        display.displayScore(player);
        display.displayEndMessage(player);
    }
}