public class Bicycle implements Vehicle{
    private String modelName;

    public Bicycle(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда " + modelName);
    }
    @Override
    public void checkEngine() {
    }

    @Override
    public void checkTrailer() {

    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return 2; // У велосипеда всегда 2 колеса
    }
}
