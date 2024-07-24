public class Truck extends Vehicle {
    public Truck(String modelName) {
        super(modelName, 6);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}