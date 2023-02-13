package bigch02.ch08;

public class OrderInfoTest {
    public static void main(String[] args) {
        OrderInfo orderInfo = new OrderInfo(
            "202011020003",
            "01043733785",
            "35000",
            "0003");
        orderInfo.orderAddress = "서울시 강남구 역삼동";
        orderInfo.orderDate = "20201102";
        orderInfo.orderTime = "130258";
        System.out.println(orderInfo.showOrderInfo());
    }
}
