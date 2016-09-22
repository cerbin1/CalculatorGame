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
        printer.nextLine();
        for (Operation operation : operations.getAll()) {
            printer.format(" %s (%c)", operation.getName(), operation.operator());
        }

        Operation operation = scanner.readOperation();
        printer.format("Wybrałeś %s", operation.getName());

        int firstNumber = random.nextInt(55) + 5;
        int secondNumber = random.nextInt(55) + 5;
        double result = operation.evaluate(firstNumber, secondNumber);
        printer.format("%d %c %d =", firstNumber, operation.operator(), secondNumber);
    }

}
