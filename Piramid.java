import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int piramid = scanner.nextInt();

        for(int i = 1; i <= piramid; i++) {
            String ast = "#";
            System.out.println(ast.repeat(i));
        }

    }
}
