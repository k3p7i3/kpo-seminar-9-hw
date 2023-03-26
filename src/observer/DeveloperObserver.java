package observer;

import game.Game;
import publisher.GamePublisher;

public class DeveloperObserver implements Observer {
    private final GamePublisher publisher;

    public DeveloperObserver(GamePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        Game game = publisher.getReleasedGame();
        System.out.println("Developer was notified");
        System.out.println("Game tech details: " + game.getTechDetails());
    }
}
