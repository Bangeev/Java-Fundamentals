package BasicSyntaxConditionalStatementsandLoopsMoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

//        Read three real numbers and sort them in descending order. Print each number on a new line.
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int largest = Math.max(num1, Math.max(num2, num3));
        int smallest = Math.min(num1, Math.min(num2, num3));
        int middle = (num1 + num2 +num3) - (largest + smallest);



        System.out.println(largest);
        System.out.println(middle);
        System.out.println(smallest);




    }
}
