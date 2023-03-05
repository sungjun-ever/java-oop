package bigch03.ch10;

public class CarTest {
    public static void main(String[] args) {
        AICar aiCar = new AICar();
        ManualCar manualCar = new ManualCar();

        aiCar.run();
        manualCar.run();
    }
}
