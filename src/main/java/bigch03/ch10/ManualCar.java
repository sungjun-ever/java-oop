package bigch03.ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("운전자가 운전 중입니다.");
    }

    @Override
    public void stop() {
        System.out.println("운전자가 차를 멈췄습니다.");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void startCar() {
        System.out.println("운전자가 시동을 걸었습니다.");
    }
}
