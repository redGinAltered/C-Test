package problem_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        boolean result;

        do {
            System.out.println("Enter the expression to check: ");
            str = scanner.nextLine();
            result = BracketsChecker.check(str);

            System.out.println("Expression is "+ (result ? "correct" : "incorrect"));

        } while(!str.equals("quit"));
    }
}
