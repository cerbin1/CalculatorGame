package danon.operation;


class Addition implements Operation {
    @Override
    public String getName() {
        return "Dodawanie";
    }

    @Override
    public char operator() {
        return '+';
    }

    @Override
    public double evaluate(double a, double b) {
        return a + b;
    }
}
