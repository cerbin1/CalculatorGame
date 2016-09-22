package danon.operation;

class Exponentiation implements Operation {
    @Override
    public String getName() {
        return "Potęga";
    }

    @Override
    public char operator() {
        return '^';
    }

    @Override
    public double evaluate(double a, double b) {
        return Math.pow(a, b);
    }
}
