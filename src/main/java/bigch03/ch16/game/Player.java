package bigch03.ch16.game;

public class Player {
    private PlayerLevel level;

    public Player(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();

    }

    public void play(int count){
        level.go(count);
    }
}
