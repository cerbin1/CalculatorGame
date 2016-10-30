package bartek;

class Player {
    private String name;
    private int score = 0;

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
}
