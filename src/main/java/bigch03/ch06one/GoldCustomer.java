package bigch03.ch06one;

public class GoldCustomer extends Customer {
    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        setCustomerGrade("Gold");
        setBonusRatio(0.02);
        salesRatio = 0.1;
        System.out.println("GoldCustomer() call");
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
