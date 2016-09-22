package danon;

import danon.operation.Operation;
import danon.operation.Operations;

import java.util.Random;

public class DanielApplication {
    private final static Random random = new Random();

    private final PrettyPrinter printer;
    private final Operations operations;
    private final RepeatingScanner scanner;

    public static void main(String... args) {
        new DanielApplication().run();
    }

    private DanielApplication() {
        printer = new PrettyPrinter();
        operations = new Operations();
        scanner = new RepeatingScanner(printer, operations);
    }

    private void run() {
        printer.writeln("Wybierz tryb, ziom :)");
        printer.printOperations(operations);

        Operation operation = scanner.readOperation();
        printer.format("Wybrałeś %s", operation.getName());

        makeMultipleGuesses(operation);
    }

    private void makeMultipleGuesses(Operation operation) {
        while (true) {
            boolean result = makeSingleGuess(operation);
            if (result) {
                boolean wannaPlay = scanner.yesNoQuestion("Wygrałeś zią. Chcesz grać jeszcze raz?");
                if (!wannaPlay) {
                    printer.writeln("Bajo :)");
                    break;
                }
            } else {
                printer.write("Złamas");
            }
        }
    }

    private boolean makeSingleGuess(Operation operation) {
        int firstNumber = randomNumber();
        int secondNumber = randomNumber();
        double result = operation.evaluate(firstNumber, secondNumber);
        printer.format("%d %c %d =", firstNumber, operation.operator(), secondNumber);

        double guessed = scanner.readDouble();
        return guessed == result;
    }

    private int randomNumber() {
        return (random.nextInt(155) + 5) / 5;
    }
}
