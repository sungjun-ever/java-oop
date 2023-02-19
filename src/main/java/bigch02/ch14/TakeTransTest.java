package bigch02.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Bus bus1000 = new Bus(1000);

        studentJ.takeBus(bus100);
        studentJ.showInfo();

        Subway greenSubway = new Subway(1);
        studentT.takeSubway(greenSubway);
        studentT.showInfo();

        Taxi taxi = new Taxi("잘나간다 운수");
        studentE.takeTaxi(taxi);
        studentE.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
        taxi.showTaxiInfo();

    }
}
