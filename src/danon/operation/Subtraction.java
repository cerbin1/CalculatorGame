package danon.operation;

class Subtraction implements Operation {
    @Override
    public String getName() {
        return "Odejmowanie";
    }

    @Override
    public char operator() {
        return '-';
    }

    @Override
    public double evaluate(double a, double b) {
        return a - b;
    }
}
