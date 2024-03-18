package Car;
public class Car {
     private String engine;
     private String category;
     private String wheels;
     private int seat;
     private boolean isLock;

     public Car(String engine, String wheels, int seat, String category, boolean isLock){
          System.out.println("Этот автомобиль ");
          setValues(engine, wheels,seat, category, isLock);
          System.out.println(displayInfo());

     }

     public void setValues(String engine, String wheels, int seat, String category,boolean isLock) {
          this.engine = engine;
          this.wheels = wheels;
          this.seat = seat;
          this.category = category;
          this.isLock = isLock;
     }
     public String displayInfo() {
          return "Engine: " + engine + "\nCategory: " + category
                  + "\nWheels: " + wheels + "\nSeat: " + seat;
     }

}