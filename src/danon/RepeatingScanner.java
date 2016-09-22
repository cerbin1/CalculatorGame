package danon;

import danon.operation.Operation;
import danon.operation.Operations;

import java.util.Scanner;

class RepeatingScanner {
    private final static Scanner scanner = new Scanner(System.in);

    private final PrettyPrinter printer;
    private final Operations operations;

    RepeatingScanner(PrettyPrinter printer, Operations operations) {
        this.printer = printer;
        this.operations = operations;
    }

    public String readNotEmptyString() {
        while (true) {
            String string = scanner.nextLine();
            if (string.length() > 0) {
                return string;
            }
            printer.format("Podany string jest pusty/");
        }
    }

    Operation readOperation() {
        while (true) {
            String chosenChar = scanner.nextLine();
            if (chosenChar.length() == 0) {
                continue;
            }
            char chosenOperator = chosenChar.charAt(0);
            Operation operation = operations.getByOperator(chosenOperator);
            if (operation != null) {
                return operation;
            }
            printer.format("Znak %c nie jest rozpoznany :/", chosenOperator);
        }
    }

    double readDouble() {
        while (true) {
            String string = scanner.nextLine();
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException e) {
                printer.format("Wyraz %s nie jest rozpoznany jako liczba :/", string);
            }
        }
    }

    boolean yesNoQuestion(String question) {
        printer.format("%s [y/n]", question);

        while (true) {
            String string = scanner.nextLine();
            if (isPositive(string)) {
                return true;
            } else if (isNegative(string)) {
                return false;
            }
            printer.format("Wyraz %s nie jest rozpoznany jako liczba :/", string);
        }
    }

    private boolean isNegative(String string) {
        return Is.value(string).inAnyOf("no", "n", "nie");
    }

    private boolean isPositive(String string) {
        return Is.value(string).inAnyOf("yes", "y", "tak");
    }
}
