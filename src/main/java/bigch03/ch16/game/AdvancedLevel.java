package bigch03.ch16.game;

public class AdvancedLevel extends PlayerLevel{
    void run() {
        System.out.println("running fast");
    }

    @Override
    void jump() {
        System.out.println("jumping high");
    }

    @Override
    void turn() {
        System.out.println("cant`t turn");
    }

    @Override
    void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다. ******");
    }

}
