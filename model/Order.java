package model;
import enums.OrderStatus;
import enums.PaymentStatus;

public class Order {
    private int orderNumber;
    private String customerName;
    private String productName;
    private double price;

    private OrderStatus orderStatus;
    private PaymentStatus paymentStatus;


    static int nextOrderNumber = 1000;

    public Order(String customerName, String productName, double price) {
        nextOrderNumber += 2;
        this.orderNumber = nextOrderNumber;
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
        this.orderStatus = OrderStatus.PREPARING;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    


    

    

}
