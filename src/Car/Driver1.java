package Car;

public class Driver1 {
    public static void main(String[] args) {
        Driver Driver1 = new Driver(5, "B", new int[]{123, 234, 345});
        Driver1.checkCarKey(new int[]{123, 234, 345});
    }
}