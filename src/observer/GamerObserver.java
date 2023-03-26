package observer;

import game.Game;
import publisher.GamePublisher;

public class GamerObserver implements Observer {
    private final GamePublisher publisher;

    public GamerObserver(GamePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        Game game = publisher.getReleasedGame();
        System.out.println("Gamer was notified");
        System.out.println("Game name: " + game.getName());
        System.out.println("Game achievements: " + game.getAchievements());
    }
}
