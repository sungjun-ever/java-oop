package bigch03.ch14;

import bigch03.ch14.Calc;

public abstract class Calculator implements Calc {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

}
