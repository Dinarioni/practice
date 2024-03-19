package Data;
import java.util.Arrays;
import java.util.Random;
public class Data  {
        public static void main(String[] args) {
            // Создаем упорядоченный массив от 1_000_000 до 1_999_999
            int[] arr = new int[1_000_000];
            for (int i = 0; i < 1_000_000; i++) {
                arr[i] = 1_000_000 + i;
            }
            Random random = new Random();
            int randomInt = random.nextInt(1_000_000) + 1_000_000;
            int index = binarySearch(arr, randomInt);
            System.out.println("Случайное число: " + randomInt);
            System.out.println("Индекс случайного числа: " + index);
        }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}