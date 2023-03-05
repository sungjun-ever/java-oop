package bigch03.ch04;

public class Customer {
    private int customerID;
    private String customerName;
    protected String customerGrade;
    int bonusPoint;
    protected double bonusRatio;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SLIVER";
        bonusRatio = 0.01;
        System.out.println("Customer() call");
    }

    public int calPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public String showCustomerInfo()
    {
        return customerName + "의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

}
