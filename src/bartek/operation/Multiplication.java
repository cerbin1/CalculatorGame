package bartek.operation;

public class Multiplication implements Operation {

    @Override
    public char getChar() {
        return '*';
    }

    @Override
    public float getResult(float first, float second) {
        return first * second;
    }

    @Override
    public String getName() {
        return "Mnozenie";
    }
}
