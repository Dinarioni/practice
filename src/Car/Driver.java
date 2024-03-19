package Car;

import java.util.Arrays;

public class Driver {
    private int Exp;
    private String Category;
    private int[] keys;

    public Driver(int Exp, String Category, int[] keys) {
        System.out.println("Водитель");
        setDriver(Exp, Category, keys);
        System.out.println(displayInfoDriver());
        for (int i : keys)
            System.out.println(i);

    }

    public void setDriver(int Exp, String Category, int[] keys) {
        this.Exp = Exp;
        this.Category = Category;
        this.keys = keys;
    }

    public String displayInfoDriver() {
        return "Опыт: " + Exp + "\nКатегория " + Category + "\nКлючи от автомобилей";
    }

    public void checkCarKey(int[] keys) {
        int Carkey = 123;
        if (Arrays.stream(keys).anyMatch(x -> x == Carkey)) {
            System.out.println("Ключ для данного автомобиля найден, автомобиль открыт и заведен");
        } else {
            System.out.println("Ключ для данного автомобиля отсутствует");
        }
    }
}