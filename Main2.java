import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int product = Digits(number);
        System.out.println("Произведение цифр числа: " + product);
    }
    private static int Digits(int number) {
        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
}