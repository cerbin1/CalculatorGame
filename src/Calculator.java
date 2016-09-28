import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    final static private Scanner scanner = new Scanner(System.in);

    private int difficulty;

    private boolean usersMenuChoiceWrong = true;

    void run() {

        Display display = new Display();
        Player player = new Player();




/*        display.askForName();


        while (true) {
            player.setName(scanner.nextLine());
            if (player.getName().length() < 3) {
                System.out.println("Your name is too short. Try type it again.");
            } else {
                break;
            }
        }

        display.displayHelloMessage(player);
        display.displayInstructions();*/

        display.askForDifficultyLevel();
        player.setDifficultyLevel(scanner.nextLine());

        while (true) {
            if (player.getDifficultyLevel().equals("easy")) {
                System.out.println("latwo");
                difficulty = 10;
                break;
            }
            else if (player.getDifficultyLevel().equals("medium") ) {
                System.out.println("srednio");
                difficulty = 100;
                break;
            }
            else if (player.getDifficultyLevel().equals("hard")) {
                System.out.println("cienszko");
                difficulty = 1000;
                break;
            }
            else {
                System.err.println("Wrong option. Try to type it once more.");
                display.askForDifficultyLevel();
                player.setDifficultyLevel(scanner.nextLine());
            }
        }

        display.displayMenu();
        display.askForMenuChoice();
        while (usersMenuChoiceWrong) {
            try {
                String usersChoice = scanner.nextLine();
                player.setMenuChoice(Integer.parseInt(usersChoice));
            } catch (NumberFormatException e) {
                System.err.println("Wrong number");
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
    }
}
