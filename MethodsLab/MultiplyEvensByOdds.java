package MethodsLab;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = findResult(num);
        System.out.println(result);
    }
    public static int findResult(int num)
    {
        int rezult = findSumOfOdds(num) * findSumOfEvens(num);
        return rezult;
    }

    public static int findSumOfOdds(int num)
    {

        int sumOfOdds = 0;

        while (num != 0)
        {
            int nextNum = num%10;

            if (nextNum % 2 == 1)
            {
                sumOfOdds += nextNum;
            }

            num /= 10;

        }

        return sumOfOdds;
    }

    public static int findSumOfEvens(int num)
    {

        int sumOfEvens = 0;
        while (num != 0)
        {
            int nextNum = num%10;

            if (nextNum % 2 == 0)
            {
                sumOfEvens += nextNum;
            }

            num /= 10;

        }

        return sumOfEvens;
    }
}
    

