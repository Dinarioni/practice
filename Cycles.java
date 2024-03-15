package Package;
public class Cycles {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int b = 0;
        do {
            System.out.println(a[b]);b++;}
        while (b < a.length);
    }
}
