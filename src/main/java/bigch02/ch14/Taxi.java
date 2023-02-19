package bigch02.ch14;

public class Taxi {
    String taxiName;
    int fee;
    int money;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
        this.fee = 10000;
    }

    public void take() {
        this.money += this.fee;
    }

    public void showTaxiInfo() {
        System.out.println(taxiName + "택시 수입은 " + money +"원 입니다.");
    }
}
