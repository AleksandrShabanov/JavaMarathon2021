package day11.task1;

public class Picker implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.plusPickedOrders();
    }

    @Override
    public void bonus() {

        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70_000;
        isPayed = true;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Количество собранных заказов: " + warehouse.getCountPickedOrders() + " ЗП сборщика: " + getSalary();
    }
}
