package game;

public class Game {
    private String name;
    private String achievements;
    private String description;
    private String techDetails;

    public Game(String name, String achievements, String description, String techDetails) {
        this.name = name;
        this.achievements = achievements;
        this.description = description;
        this.techDetails = techDetails;
    }

    public String getName() {
        return name;
    }

    public String getAchievements() {
        return achievements;
    }

    public String getDescription() {
        return description;
    }

    public String getTechDetails() {
        return techDetails;
    }
}
