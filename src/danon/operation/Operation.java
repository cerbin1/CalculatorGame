package danon.operation;

public interface Operation {
    String getName();
    char operator();
    double evaluate(double a, double b);
}
