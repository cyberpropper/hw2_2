public class Car extends Vehicle {
    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}