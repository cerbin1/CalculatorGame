package bartek;

@SuppressWarnings("unused")
enum Difficulty {
    EASY {
        @Override
        int getLevel() {
            return 10;
        }

        @Override
        String getDescription() {
            return "You chose easy level.";
        }
    },

    MEDIUM {
        @Override
        int getLevel() {
            return 100;
        }

        @Override
        String getDescription() {
            return "You chose medium level.";
        }
    },

    HARD {
        @Override
        int getLevel() {
            return 1000;
        }

        @Override
        String getDescription() {
            return "You chose hard level.";
        }
    };

    abstract int getLevel();

    abstract String getDescription();
}
