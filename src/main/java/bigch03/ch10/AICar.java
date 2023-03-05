package bigch03.ch10;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AI가 차를 운전 중입니다.");
    }

    @Override
    public void stop() {
        System.out.println("AI가 차를 멈췄습니다.");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void turnOff() {
        System.out.println("AI가 시동을 껐습니다.");
    }

}
