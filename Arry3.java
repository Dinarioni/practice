public class Arry3 {
    public static void main(String[] args) {
        String[] array = {"A", null, "B", "C", null, "D"};
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] == null) {
                break;
            }
            System.out.println(array[i]);
        }
    }
}