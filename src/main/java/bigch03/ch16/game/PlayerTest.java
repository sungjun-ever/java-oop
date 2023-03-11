package bigch03.ch16.game;

public class PlayerTest {
    public static void main(String[] args) {
        Player beginnerPlayer = new Player(new BeginnerLevel());
        beginnerPlayer.play(1);

        beginnerPlayer.upgradeLevel(new AdvancedLevel());
        beginnerPlayer.play(2);

        beginnerPlayer.upgradeLevel(new SuperLevel());
        beginnerPlayer.play(3);
    }
}
