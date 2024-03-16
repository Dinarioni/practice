import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        int number = Scanner.nextInt();
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}