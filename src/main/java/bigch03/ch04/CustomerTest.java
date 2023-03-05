package bigch03.ch04;

public class CustomerTest {
    public static void main(String[] args)
    {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김철수");
        customerKim.bonusPoint = 2000;
        price = customerKim.calPrice(2000);
        System.out.println(customerKim.showCustomerInfo() + price);
    }
}
