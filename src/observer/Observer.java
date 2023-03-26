package observer;

import publisher.GamePublisher;

public interface Observer {
    /**
        in context of this program "update" means get info about
        last released game from publisher and print the info
    */
    public void update();
}
