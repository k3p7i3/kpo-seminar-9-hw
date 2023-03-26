import game.Game;
import observer.DeveloperObserver;
import observer.GamerObserver;
import observer.JournalistObserver;
import observer.Observer;
import publisher.GamePublisher;

public class Main {
    public static void main(String[] args) {
        // create game publisher
        GamePublisher publisher = new GamePublisher();

        // create observers - one for each entity
        Observer gamer = new GamerObserver(publisher);
        Observer journalist = new JournalistObserver(publisher);
        Observer developer = new DeveloperObserver(publisher);

        // publish games
        Game sims4 = new Game(
                "Sims4",
                "1) Black Widow\n2) Alphabet Legacy\n3)Captain of Industry",
                "The Sims 4 is the ultimate life simulation game.",
                "OS: 64Bit Windows 10 or Mac OS X 10.11\nRAM: at least 4GB"
        );
        publisher.releaseGame(sims4);

        Game minecraft = new Game(
                "Minecraft",
                "1) Monster Hunter\n2) Archer\n3) Body Guard",
                "Minecraft is a video game in which players create and break apart" +
                        " various kinds of blocks in three-dimensional worlds.",
                "CPU: Intel Core i5 4690 | AMD A10 7800 or equivalent.\n" +
                        "RAM: 8 GB RAM."
        );
        publisher.releaseGame(minecraft);
    }
}