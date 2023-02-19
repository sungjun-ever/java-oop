package bigch02.ch14;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take();
        this.money -= bus.fee;
    }

    public void takeSubway(Subway subway) {
        subway.take();
        this.money -= subway.fee;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take();
        this.money -= taxi.fee;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈 " + money + "원 입니다.");
    }
}
