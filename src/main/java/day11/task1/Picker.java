package day11.task1;

public class Picker implements Worker {

    private double salary;
    private boolean isPayed;
    Warehouse warehouse = new Warehouse();

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;

    }

    @Override
    public void bonus() {

        if (warehouse.countPickedOrders < 10_000)
            System.out.println("Бонус пока не доступен");

        if (warehouse.countPickedOrders > 10_000)
            System.out.println("Бонус уже был выплачен");

        if (warehouse.countPickedOrders == 10_000) {
            salary += 70_000;
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

        return null;
    }
}
