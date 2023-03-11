package bigch03.ch16.game;

public class SuperLevel extends PlayerLevel {
    void run() {
        System.out.println("running super fast");
    }

    @Override
    void jump() {
        System.out.println("jumping super high");
    }

    @Override
    void turn() {
        System.out.println("turning");
    }

    @Override
    void showLevelMessage() {
        System.out.println("****** 고급자 레벨입니다. ******");
    }

}
