package danon;


import java.io.PrintStream;

class PrettyPrinter {
    private PrintStream out = System.out;

    void format(String format, Object... args) {
        String message = String.format(format, args);
        writeln(message);
    }

    void nextLine() {
        writeln("");
    }

    void write(String message) {
        out.print(message);
    }

    void writeln(String message) {
        out.println(message);
    }
}
