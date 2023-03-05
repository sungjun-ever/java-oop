package bigch03.ch06;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 걷는 중입니다.");
    }

    public void readBook(){
        System.out.println("책을 읽고 있습니다.");
    }
}
