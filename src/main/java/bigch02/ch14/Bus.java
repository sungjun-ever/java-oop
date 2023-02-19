package bigch02.ch14;

public class Bus {
    int busNumber;
    int passengerCount;
    int fee;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        this.fee = 1300;
    }

    public void take() {
        this.money += this.fee;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
