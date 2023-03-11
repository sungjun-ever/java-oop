package bigch03.ch16.game;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    public void go(int count){
        run();
        for (int i = 1; i <= count; i++) {
            jump();
        }
        turn();
    }
}
