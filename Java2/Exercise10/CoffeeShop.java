package Java2.Exercise10;

import java.util.Random;

import java.util.*;

class Order {
    int orderId;
    int price;

    public Order(int orderId, int price) {
        this.orderId = orderId;
        this.price = price;
    }
    public int getOrderId() {
        return orderId;
    }

}
class Cashier  {
    static int count=0;
    static Queue<Integer> orderIdList=new PriorityQueue<>() ;
    static Queue<Integer> completedorderIdList=new PriorityQueue<>();
    public int PaymentGenerateToken (int pay,String orderItem) {
        boolean paymentReceived;
        if(pay>0)
        {
            int orderId = ++count;
            paymentReceived=true;
            orderIdList.add(orderId);
            new Barista().orderPreparation(orderId,orderItem);
            return orderId;
        }
        else
        {
            paymentReceived=false;
        }
        return 0;
    }

}
class Barista extends Cashier  {

    public void orderPreparation(int id,String Item) {
        completedorderIdList.add(id);

        if(orderIdList.remove(id))
        {
            System.out.println("Notification :: order no:"+ id +" prepared! ");
        }
    }
}
class Customer {
    public int order() {
        System.out.println("Order and Payment Please:");
        Scanner sc=new Scanner(System.in);
        String item=sc.next();
        int pay=sc.nextInt();//user will give the payment
        return new Cashier().PaymentGenerateToken(pay,item);
    }

}
public class CoffeeShop {
    public static void main(String[] args) {
        Customer customer = new Customer();
        int orderId= customer.order();
    }
}