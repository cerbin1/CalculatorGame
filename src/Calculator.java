import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    final static private Scanner scanner = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private int difficulty;

    void run() {

        Display display = new Display();
        display.askForName();
        boolean usersMenuChoiceWrong = true;


        Player player = new Player();

/*        while (true) {
            player.setName(scanner.nextLine());
            if (player.getName().length() < 3) {
                System.out.println("Your name is too short. Try type it again.");
            } else {
                break;
            }
        }

        display.displayHelloMessage(player.getName());
        display.displayInstructions();

        display.displayMenu();
        display.askForMenuChoice();*/

        while (true) {
            if ((player.getDifficultyLevel() != 10) && (player.getDifficultyLevel() != 100) && (player.getDifficultyLevel() != 1000)) {
                display.askForDifficultyLevel();
                player.setDifficultyLevel(scanner.nextInt());
            } else {
                break;
            }
        }

        difficulty = player.getDifficultyLevel();
        scanner.nextLine();

        while (usersMenuChoiceWrong) {
/*            try {
                String usersChoice = scanner.nextLine();
                player.setUsersChoice(Integer.parseInt(usersChoice));
            } catch (NumberFormatException e) {
                System.err.println("Wrong number");
            }
            switch (player.getUsersChoice()) {*/
            switch (1) {
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
