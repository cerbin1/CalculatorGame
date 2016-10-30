package bartek.operation;

public class Power implements Operation{

    @Override
    public char getChar() {
        return '^';
    }

    @Override
    public float getResult(float first, float second) {
        return (float)Math.pow(first, second);
    }

    @Override
    public String getName() {
        return "Potęga";
    }
}
