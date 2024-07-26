public class Bicycle extends Vehicle {
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Проверяем тормоза велосипеда");
    }
}
