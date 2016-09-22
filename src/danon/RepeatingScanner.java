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
}
