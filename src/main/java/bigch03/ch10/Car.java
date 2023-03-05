package bigch03.ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 걸었습니다.");
    }

    public void turnOff() {
        System.out.println("시동을 껐습니다.");
    }

    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
