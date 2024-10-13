public class ServiceStation implements Service {

    @Override
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            if (vehicle instanceof Truck) {
                System.out.println("Проверяем прицеп");
            }
        } else {
            System.out.println("Нет транспортного средства для обслуживания.");
        }
    }
}
