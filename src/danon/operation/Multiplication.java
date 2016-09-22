package danon.operation;

class Multiplication implements Operation {
    @Override
    public String getName() {
        return "Mnożenie";
    }

    @Override
    public char operator() {
        return '*';
    }

    @Override
    public double evaluate(double a, double b) {
        return a * b;
    }
}
