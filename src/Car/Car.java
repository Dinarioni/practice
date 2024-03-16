package Car;
abstract class Car1 {
     private Engine engine;
     private Wheel wheels;
     private int seat;
     private String Category;
     private Lock Locked;
     public Car1 (Engine engine, Wheel wheels, int seat, String Category, Lock Locked) {
          this.engine = engine;
          this.wheels = wheels;
          this.seat = seat;
          this.Category = Category;
          this.Locked = Locked;
     }
     abstract void start();
     public void refuel() {
     }
     public void drive() {
     }
     static class Engine {
          double volume;
          String fuelType;
          String name;
          public Engine(double volume, String fuelType, String name) {
               this.volume = volume;
               this.fuelType = fuelType;
               this.name = name;
          }
     }
     static class Wheel {
          double radius;
          String seasonType;
          String name;
          public Wheel(double radius, String seasonType, String name) {
               this.radius = radius;
               this.seasonType = seasonType;
               this.name = name;
          }
     }
     static class Lock {
          String[] keys;
          public Lock(String[] keys) {
               this.keys = keys;
          }
          public static void main(String[] args) {
               System.out.println(Car1);}
          }
     }
}