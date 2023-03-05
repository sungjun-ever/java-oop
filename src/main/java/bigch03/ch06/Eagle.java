package bigch03.ch06;

public class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("날고 있는 중입니다.");
    }

    public void flying() {
        System.out.println("날개를 펴고 날고 있습니다.");
    }
}
