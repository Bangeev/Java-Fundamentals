package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int lenght = 1;
        int maxLenght = 0;
        int curentIndex = 0;

        int bestStartIntex = 0;
        for (int i = 1; i <= numsArray.length - 1; i++) {

//            2 1 1 2 3 3 2 2 2 1
            if (numsArray[i] == numsArray[i - 1]){
                lenght++;

            }else {
                lenght = 1;

                curentIndex = i;
            }

            if (lenght > maxLenght){
                maxLenght = lenght;
                bestStartIntex = curentIndex;

            }


        }
        for (int j = bestStartIntex; j < bestStartIntex + maxLenght; j++) {
            System.out.print(numsArray[j] + " ");
        }



    }
}
