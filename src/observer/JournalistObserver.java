package observer;

import game.Game;
import publisher.GamePublisher;

public class JournalistObserver implements Observer{
    private final GamePublisher publisher;

    public JournalistObserver(GamePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        Game game = publisher.getReleasedGame();
        System.out.println("Journalist was notified");
        System.out.println("Game description: " + game.getDescription());
    }
}
