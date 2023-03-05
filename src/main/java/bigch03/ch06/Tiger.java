package bigch03.ch06;

public class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 걷고 있습니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥 중입니다.");
    }
}
