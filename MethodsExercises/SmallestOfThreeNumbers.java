package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        calculateSmallestNumberOfThreeNums(firstNumber, secondNumber, thirdNumber);

    }

    public static void calculateSmallestNumberOfThreeNums(int numOne, int numTwo, int numThree){

        if (numOne < numTwo && numOne < numThree){
            System.out.println(numOne);
        }else if (numTwo < numOne && numTwo < numThree){
            System.out.println(numTwo);
        }else {
            System.out.println(numThree);
        }
    }

}
