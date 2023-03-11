package bigch03.ch11;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(3, 5 ));
        System.out.println(calc.subtract(3, 5 ));
        System.out.println(calc.times(3, 5 ));
        System.out.println(calc.divide(3, 5 ));

    }
}
