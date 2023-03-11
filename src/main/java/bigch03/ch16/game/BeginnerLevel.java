package bigch03.ch16.game;

public class BeginnerLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("running slow");
    }

    @Override
    void jump() {
        System.out.println("can`t jump");
    }

    @Override
    void turn() {
        System.out.println("cant`t turn");
    }

    @Override
    void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }

}
