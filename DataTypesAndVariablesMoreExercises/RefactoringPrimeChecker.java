package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {

 
    Scanner scanner = new Scanner(System.in);

    int input = Integer.parseInt(scanner.nextLine());
    
    
            for (int i = 2; i <= input; i++) {
                boolean arePrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                         arePrime = false;
                         break;
                    }
                }
        System.out.printf("%d -> %b%n", i, arePrime);

            }
    }
}