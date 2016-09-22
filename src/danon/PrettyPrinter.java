package danon;


import danon.operation.Operation;
import danon.operation.Operations;

import java.io.PrintStream;

class PrettyPrinter {
    private PrintStream out = System.out;

    void format(String format, Object... args) {
        String message = String.format(format, args);
        writeln(message);
    }

    private void nextLine() {
        writeln("");
    }

    void write(String message) {
        out.print(message);
    }

    void writeln(String message) {
        out.println(message);
    }

    void printOperations(Operations operations) {
        nextLine();
        for (Operation operation : operations.getAll()) {
            format(" %s (%c)", operation.getName(), operation.operator());
        }
    }
}
