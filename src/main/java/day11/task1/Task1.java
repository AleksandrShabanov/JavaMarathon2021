package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        businessProcess(picker);
        businessProcess(courier);
        courier2.doWork();
        picker2.doWork();

        System.out.println("Количество собранных заказов: " + picker.warehouse.countPickedOrders + " ЗП сборщика: " + picker.getSalary());
        System.out.println("Количество доставвленных заказов: " + courier.warehouse.countDeliveredOrders + " ЗП курьера: " + courier.getSalary());
    }

    public static void businessProcess(Worker worker){
        for (int i = 0; i < 10_000; i++){
            worker.doWork();
            if (i == 9999)
                worker.bonus();
        }
    }
}
