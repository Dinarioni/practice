package Package;
class Orange {
    String size;
    String color;
    public Orange (String size, String color) {
        this.size = size;
        this.color = color;
    }
    public String toString() {
        return "Size: " + size + ", Color: " + color;
    }
}
class Apple {
    String size;
    String color;
    public Apple(String size, String color) {
        this.size = size;
        this.color = color;
    }
    public String toString() {
        return "Size: " + size + ", Color: " + color;
    }
}
public class Data {
    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = new Orange ("Small", "Orange");
        objects[1] = new Apple ("Medium", "Red");
        for (Object obj : objects) {
            System.out.println("Fruit " +obj);
        }
    }
}