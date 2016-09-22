package danon;

import java.util.Arrays;

class Is {
    static IsChecker value(String string) {
        return new Is.IsChecker(string);
    }

    private static class IsChecker {
        private String value;

        IsChecker(String value) {
            this.value = value;
        }

        boolean inAnyOf(String... args) {
            return Arrays.asList(args).contains(value);
        }
    }
}
