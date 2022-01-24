package ArraysLab;

import java.util.Scanner;

public class PrintNUmbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numsArr = new int[n];

        for (int i = 0; i < numsArr.length; i++) {

            numsArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numsArr.length - 1; i >= 0 ; i--) {
            System.out.print(numsArr[i] + " ");
        }




    }
}
