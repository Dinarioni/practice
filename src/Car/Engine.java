package Car;

public abstract class Engine {
    private double volume;
    private String fuelType;
    private String name;

    public Engine(double volume, String fuelType, String name) {
        this.volume = volume;
        this.fuelType = fuelType;
        this.name = name;
    }
}
