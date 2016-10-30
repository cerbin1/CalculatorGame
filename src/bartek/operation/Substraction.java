package bartek.operation;

public class Substraction implements Operation {
    @Override
    public char getChar() {
        return '-';
    }

    @Override
    public float getResult(float first, float second) {
        return first - second;
    }

    @Override
    public String getName() {
        return "Odejmowanie";
    }
}
