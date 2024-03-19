package Car;

abstract class Engine {
    protected double volume;
    protected String fuelType;
    protected String name;

    public Engine(double volume, String fuelType, String name) {
        this.volume = volume;
        this.fuelType = fuelType;
        this.name = name;
    }
}
