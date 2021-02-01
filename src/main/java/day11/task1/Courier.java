package day11.task1;

public class Courier implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.plusDeliveredOrders();
    }

    @Override
    public void bonus() {

        if (warehouse.getCountDeliveredOrders() < 10_000)
            System.out.println("Бонус пока не доступен");

        if (warehouse.getCountDeliveredOrders() > 10_000)
            System.out.println("Бонус уже был выплачен");

        if (warehouse.getCountDeliveredOrders() == 10_000) {
            salary += 50_000;
            isPayed = true;
        }
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Количество доставленных заказов: " + warehouse.getCountDeliveredOrders() + " ЗП курьера: " + getSalary();
    }
}
