package danon;


import danon.operation.Operation;
import danon.operation.Operations;

class PrettyPrinter {
    void format(String format, Object... args) {
        String message = String.format(format, args);
        writeln(message);
    }

    private void nextLine() {
        writeln("");
    }

    void write(String message) {
        System.out.print(message);
    }

    void writeln(String message) {
        System.out.println(message);
    }

    void printOperations(Operations operations) {
        nextLine();
        for (Operation operation : operations.getAll()) {
            format(" %s (%c)", operation.getName(), operation.operator());
        }
    }
}
