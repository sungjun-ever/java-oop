package bigch03.ch15;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("Sell order");
    }
}
