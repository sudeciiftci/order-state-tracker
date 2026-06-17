package service;

import java.util.ArrayList;
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
}


