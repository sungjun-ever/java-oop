package bigch02.ch19;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int carNum = 10000;

    public static CarFactory getInstance() {
        if( instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        carNum++;
        return new Car();
    }

    public int getCarNum(){
        return carNum;
    }

}
