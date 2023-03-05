package bigch03.ch04;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        setCustomerGrade("VIP");
        setBonusRatio(0.05);
        salesRatio = 0.1;
        System.out.println("VIPCustomer() call");
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
