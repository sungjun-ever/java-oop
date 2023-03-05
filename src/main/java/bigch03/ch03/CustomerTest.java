package bigch03.ch03;

public class CustomerTest {
    public static void main(String[] args)
    {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김철수");
        customerKim.bonusPoint = 2000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer(1234, "noname");
    }
}
