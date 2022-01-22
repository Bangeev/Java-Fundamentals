package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       /* Read four integer numbers. Add first to the second, divide (integer) the sum by the third number,
        and multiply the result by the fourth number. Print the result.
                Constraints
•	The four numbers from the input are in the range [-2,147,483,648… 2,147,483,647]
*/
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int forthNumber = Integer.parseInt(scanner.nextLine());

        double result = ((firstNumber + secondNumber) / thirdNumber * 1.0) * forthNumber;


        System.out.printf("%.0f", result);
    }
}
