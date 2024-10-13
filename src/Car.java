class Car implements Vehicle {
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля " + modelName);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля " + modelName);
    }

    @Override
    public void checkTrailer() {

    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
}
