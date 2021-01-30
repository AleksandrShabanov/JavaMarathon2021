package day11.task1;

public class Warehouse {

     private int countPickedOrders;
     private int countDeliveredOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }



    public String toString(){

        return null;
    }

    public int plusPickedOrders(){
        return countPickedOrders++;
    }

    public int plusDeliveredOrders(){
        return countDeliveredOrders++;
    }
}
