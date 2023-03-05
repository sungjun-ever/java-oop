package bigch03.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        MyNotebook myNotebook = new MyNotebook();

        desktop.turnOn();
        desktop.display();
        desktop.typing();
        desktop.turnOff();

        myNotebook.turnOn();
        myNotebook.display();
        myNotebook.typing();
        myNotebook.turnOff();
    }
}
