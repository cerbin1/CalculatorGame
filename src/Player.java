public class Player {
    private String name;
    private int score = 0;
    private int usersChoice;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUsersChoice(int choice) {
        this.usersChoice = choice;
    }

    public int getUsersChoice() {
        return usersChoice;
    }
}
