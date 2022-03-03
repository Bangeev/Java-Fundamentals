package TextProcessingExercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger numOne = new BigInteger(scanner.nextLine());
        BigInteger numTwo = new BigInteger(scanner.nextLine());

       BigInteger result = numOne.multiply(numTwo);

        System.out.println(result);
    }
}
