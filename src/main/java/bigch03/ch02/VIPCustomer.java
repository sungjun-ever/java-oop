package bigch03.ch02;

public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        setCustomerGrade("VIP");
        setBonusRatio(0.05);
        salesRatio = 0.01;
    }
}
