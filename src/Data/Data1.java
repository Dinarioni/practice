package Data;

import java.util.Random;
import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        bubbleSort(array);
        int startIndex, endIndex;
        System.out.println("Введите начальный и конечный индексы массива (разделенные пробелом):");
        Scanner scanner = new Scanner(System.in);
        String[] indexes = scanner.nextLine().split(" ");
        startIndex = Integer.parseInt(indexes[0]);
        endIndex = Integer.parseInt(indexes[1]);

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}