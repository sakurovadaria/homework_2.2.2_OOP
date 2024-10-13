public class Main {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1"),
                new Bicycle("bicycle2")
        };

        Service station = new ServiceStation();

        // Обслуживаем все транспортные средства в цикле
        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }

}