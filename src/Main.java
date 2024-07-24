public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Truck truck1 = new Truck("truck1");
        Bicycle bicycle1 = new Bicycle("bicycle1");

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(truck1);
        station.check(bicycle1);

        car1.updateTyre("зимнюю покрышку");
        truck1.updateTyre("летнюю покрышку");
    }
}