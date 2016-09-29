class Display {
    public Display() {

    }
    // TODO klasa Display powinna dostawać gracza w konstruktorze i zapiasć go do pola

    void askForName() {
        System.out.println("Hello, what is your namne?");
    }

    void displayHelloMessage(Player p) {
        System.out.println("Hello " + p.getName());
    }

    void displayInstructions() {
        System.out.println("You will have to choose the difficulty of the game and then choose which operations do you want to do.");
    }

    void displayMenu() {
        System.out.println("Now choose what you want to do:");
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
        System.out.println("'easy' - Max one-digit operations");
        System.out.println("'medium' - Max two-digits operations");
        System.out.println("'hard' - Max three-digits operations");
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

    void displayEndMessage(Player p) {
        System.out.println("Bye " + p.getName());
    }
}
// TODO w klasie Display metody które zaczynają się od ask powinny w środu robić scanner.nextLine() i zwracać to co ktoś wpisał.