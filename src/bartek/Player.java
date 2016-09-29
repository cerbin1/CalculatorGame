package bartek;

class Player {
    private String name;
    private int score = 0;
    private int menuChoice;
    private Difficulty difficulty;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    void addPoint() {
        this.score++;
    }

    void setMenuChoice(int choice) {
        this.menuChoice = choice;
    }

    int getMenuChoice() {
        return menuChoice;
    }

    void setDifficulty(Difficulty diff) {
        this.difficulty = diff;
    }

    Difficulty getDifficulty() {
        return difficulty;
    }
}
