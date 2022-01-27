package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numsArray.length; i++) {

            for (int j = i + 1; j <= numsArray.length - 1; j++) {

                if (numsArray[i] + numsArray[j] == num){
                    System.out.println(numsArray[i] + " " + numsArray[j]);

            }


            }

        }


    }
}
