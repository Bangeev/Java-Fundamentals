package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        You will be given a single integer. Your task is to find the sum of its digits.

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        while(number > 0){
            sum += number % 10;
            number = number /10;

        }
        System.out.println(sum);



    }
}
