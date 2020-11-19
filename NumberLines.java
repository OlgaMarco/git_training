import java.util.Scanner;

public class NumberLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Copy a text with END at the end. Enter Ctrl+C to exit: ");
        int numberLines = 0;

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] wordsText = line.split(" ");
            String firstWord = wordsText[0];
            numberLines = numberLines + 1;
            if (firstWord.equals("END")) {
                numberLines = numberLines -1;
                System.out.print(numberLines);
            } }
}}
