package bigch03.ch06one;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args)
    {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10010, "이순신"));
        customerList.add(new VIPCustomer(10020, "김철수"));
        customerList.add(new GoldCustomer(10030, "박진수"));

        for (Customer customer : customerList) {
            customer.bonusPoint = 1000;
            int price = customer.calPrice(1000);
            System.out.println(customer.showCustomerInfo() + price);
        }
//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.bonusPoint = 1000;
//        int price = customerLee.calPrice(1000);
//        System.out.println(customerLee.showCustomerInfo() + price);
//
//        VIPCustomer customerKim = new VIPCustomer(10020, "김철수");
//        customerKim.bonusPoint = 2000;
//        price = customerKim.calPrice(2000);
//        System.out.println(customerKim.showCustomerInfo() + price);
//
//        GoldCustomer customerPark = new GoldCustomer(10030, "박진수");
//        customerPark.bonusPoint = 1000;
//        price = customerPark.calPrice(1000);
//        System.out.println(customerPark.showCustomerInfo() + price);

    }
}
