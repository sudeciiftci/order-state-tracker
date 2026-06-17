package service;

import java.util.ArrayList;

import enums.OrderStatus;
import enums.PaymentStatus;
import model.Order;

public class OrderService {
    public ArrayList<Order> list = new ArrayList<>();

    public ArrayList<Order> allOrderList(){
        return list;
    }

    public void addOrder(Order order){
        list.add(order);
    }

    public Order getOrderByNumber(int orderNumber){ 

        for(Order o : list){
            if(o.getOrderNumber() == orderNumber){
                return o;
            }
        }
        return null;
    }

    public void processPayment(Order order){

        PaymentStatus paymentStatus = order.getPaymentStatus();
        
        if(paymentStatus.equals(PaymentStatus.PENDING)){
            order.setPaymentStatus(PaymentStatus.PAID);
        }
    }

    public void shipOrder(Order order){

        OrderStatus orderStatus = order.getOrderStatus();

        if(orderStatus.equals(OrderStatus.PREPARING) ){
            order.setOrderStatus(OrderStatus.SHIPPED);
        }
    }
}


