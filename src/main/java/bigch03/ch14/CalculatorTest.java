package bigch03.ch14;

import bigch03.ch14.Calc;
import bigch03.ch14.CompleteCalc;

public class CalculatorTest {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(x, y));
        System.out.println(calc.subtract(x, y));
        System.out.println(calc.times(x, y));
        System.out.println(calc.divide(x, y));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));

    }
}
