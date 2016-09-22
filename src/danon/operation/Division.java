package danon.operation;

class Division implements Operation {
    @Override
    public String getName() {
        return "Dzielenie";
    }

    @Override
    public char operator() {
        return '/';
    }

    @Override
    public double evaluate(double a, double b) {
        return a / b;
    }
}
