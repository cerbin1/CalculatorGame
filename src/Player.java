class Player {
    private String name;
    private int score = 0;
    private int menuChoice;
    private String difficultyLevel; //TODO Player.difficultyLevel powinno być enumem, a nie stringiem.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addPoint() {
        this.score++;
    }

    public void setMenuChoice(int choice) {
        this.menuChoice = choice;
    }

    public int getMenuChoice() {
        return menuChoice;
    }

    public void setDifficultyLevel(String diff) {
        this.difficultyLevel = diff;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }


}
