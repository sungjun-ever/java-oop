package bigch03.ch03;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;


//    public VIPCustomer() {
//        super(0, "noname");
//        setCustomerGrade("VIP");
//        setBonusRatio(0.05);
//        salesRatio = 0.01;
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        setCustomerGrade("VIP");
        setBonusRatio(0.05);
        salesRatio = 0.01;
        System.out.println("VIPCustomer() call");
    }
}
