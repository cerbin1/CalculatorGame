import java.util.Scanner;

public class Calculator {

    final static private Scanner scanner = new Scanner(System.in);

    void run() {

        Display display = new Display();
        display.askForName();
        String dataFromUser;

        Player player = new Player();

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
        display.displayMenu();
        display.askForMenuChoice();
        try {
            player.setUsersChoice(scanner.nextInt());
//            Integer.parseInt(player.getUsersChoice());
        } catch ()
        switch (player.getUsersChoice()) {
            case 1:
                System.out.println("pizda");
        }
    }
}
