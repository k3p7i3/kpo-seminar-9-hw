package publisher;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import game.Game;
import observer.Observer;

public class GamePublisher {
    /**
     * Publisher releases game and notifies about it all 'followed' observers
     */
    private Game releasedGame;

    // weak reference to not allow memory leak
    private final List<WeakReference<Observer>> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(new WeakReference<>(observer));
    }

    public Game getReleasedGame() {
        return releasedGame;
    }

    public void releaseGame(Game game) {
        releasedGame = game;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (WeakReference<Observer> ref : observers) {
            Observer observer = ref.get();
            if (observer != null) {
                observer.update();
            }
        }
    }

}
