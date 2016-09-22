package danon.operation;

import java.util.*;

public class Operations {
    private final Map<Character, Operation> operations = new LinkedHashMap<>();

    public Operations() {
        init();
    }

    private void init() {
        add(new Addition());
        add(new Subtraction());
        add(new Multiplication());
        add(new Division());
        add(new Exponentiation());
    }

    private void add(Operation operation) {
        operations.put(operation.operator(), operation);
    }

    public Collection<Operation> getAll() {
        return operations.values();
    }

    public Operation getByOperator(char operator) {
        return operations.get(operator);
    }
}
