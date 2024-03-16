package Car;

interface DriverActions {
    void startCar(Car car);
    void driveCar(Car car);
    void takePassengers();
    void refuelCar(Car car);
}

class Driver implements DriverActions {
    private int Experience;
    private String Category;
    private boolean hasCarKeys;

    public Driver(int Experience, String Category, boolean hasCarKeys) {
        this.Experience = Experience;
        this.Category = Category;
        this.hasCarKeys = hasCarKeys;
    }

    @Override
    public void startCar(Car car) {
        if (hasCarKeys) {
            car.start();
            System.out.println("Машина заведена.");
        } else {
            System.out.println("Машина не может быть заведена.");
        }
    }

    @Override
    public void driveCar(Car car) {
        if (Category.equals(car.Category)) {
            car.drive();
            System.out.println("Можно управлять машиной");
        } else {
            System.out.println("Нет водительской категории");
        }
    }

    @Override
    public void takePassengers() {
        System.out.println("Есть пассажиры");
    }

    @Override
    public void refuelCar(Car car) {
        car.refuel();
        System.out.println("Водитель заправил автомобиль");
    }

}