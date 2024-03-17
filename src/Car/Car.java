package Car;
public class Car {
     private String engine;
     private String category;
     private String wheels;
     private int seat;

     public Car(String engine, String wheels, int seat, String category){
          System.out.println("Этот автомобиль ");
          setValues(engine, wheels,seat, category);
          System.out.println(displayInfo());

     }

     public void setValues(String engine, String wheels, int seat, String category) {
          this.engine = engine;
          this.wheels = wheels;
          this.seat = seat;
          this.category = category;
     }
     public String displayInfo() {
          return "Engine: " + engine + "\nCategory: " + category + "\nWheels: " + wheels + "\nSeat: " + seat;
     }

}