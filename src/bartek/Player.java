package bartek;

class Player {
    private String name;
    private int score = 0;
    private Difficulty difficulty;

    void setName(String name) { // TODO to powinien być parametr konstruktora
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


    void setDifficulty(Difficulty diff) {
        this.difficulty = diff;
    }

    Difficulty getDifficulty() {
        return difficulty;
    }
}
