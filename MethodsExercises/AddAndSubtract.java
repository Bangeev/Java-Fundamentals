package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());


        int result = sumOfTwoNumbers(firstNumber, secondNumber) - thirdNumber;
        System.out.println(result);

    }

    public static int sumOfTwoNumbers(int num1, int num2){
        return num1 + num2;
    }


}
