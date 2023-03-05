package bigch03.ch09;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크탑 화면이 켜졌습니다.");
    }

    @Override
    public void typing() {
        System.out.println("테스크탑 타이핑 중입니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("데스크탑이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑이 꺼졌습니다.");
    }
}
