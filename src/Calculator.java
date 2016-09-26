import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    final static private Scanner scanner = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private int difficulty;

    private boolean usersMenuChoiceWrong = true;

    void run() {

        Display display = new Display();
        Player player = new Player();

        display.askForName();




        while (true) {
            player.setName(scanner.nextLine());
            if (player.getName().length() < 3) {
                System.out.println("Your name is too short. Try type it again.");
            } else {
                break;
            }
        }

        display.displayHelloMessage(player.getName());
        display.displayInstructions();


        while (true) {
            if ((player.getDifficultyLevel() != 1) && (player.getDifficultyLevel() != 2) && (player.getDifficultyLevel() != 3)) {
                display.askForDifficultyLevel();
                player.setDifficultyLevel(scanner.nextInt());
            } else {
                break;
            }
        }
        switch (player.getDifficultyLevel()) {
            case 1:
                difficulty = 10;
                break;
            case 2:
                difficulty = 100;
                break;
            case 3:
                difficulty = 1000;
                break;
        }
        scanner.nextLine();

        display.displayMenu();
        display.askForMenuChoice();
        while (usersMenuChoiceWrong) {
            try {
                String usersChoice = scanner.nextLine();
                player.setUsersChoice(Integer.parseInt(usersChoice));
            } catch (NumberFormatException e) {
                System.err.println("Wrong number");
            }
            switch (player.getUsersChoice()) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        firstNumber = (int) (Math.random() * difficulty) + 1;
                        secondNumber = (int) (Math.random() * difficulty) + 1;

                        display.displayQuestion(i, firstNumber, secondNumber, '+');
                        display.askForAnswer();

                        if (Objects.equals(scanner.nextLine(), Integer.toString(firstNumber + secondNumber))) {
                            display.goodAnswer();
                            player.addPoint(player);
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
                            player.addPoint(player);
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
                            player.addPoint(player);
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
                            player.addPoint(player);
                        } else {
                            display.wrongAnswer();
                        }
                    }
                    usersMenuChoiceWrong = false;
                    break;
            }
        }
        display.displayScore(player);
    }
}
