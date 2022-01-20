package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        /*A number is special when its sum of digits is 5, 7, or 11.
        Write a program to read an integer n and for all numbers in the range 1…n to print the number and if it is special or not (True / False).
*/

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {
            int sumDigits = 0;
            int num = i;

            while(num > 0) {
                sumDigits = sumDigits + (num % 10);
                num = num / 10;




            }

            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.println(i +" -> True");
            }else System.out.println(i +" -> False");

        }




    }
}
