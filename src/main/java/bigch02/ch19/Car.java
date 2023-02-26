package bigch02.ch19;

public class Car {
    private int carNum = CarFactory.getInstance().getCarNum();

    public int getCarNum(){
        return carNum;
    }
}
