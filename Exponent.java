import java.util.Scanner;

public class Exponent  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base and Exponent: ");
        int base = scanner.nextInt();
        int exp = scanner.nextInt();
        int num = 1;

        for (int i = 0; i<exp; i++) {
            num = num * base;
        }
        System.out.println(num);
    }
}
