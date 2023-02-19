package bigch02.ch14;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int fee;
    int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
        this.fee = 2000;
    }

    public void take() {
        this.money += this.fee;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "번 전철의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
