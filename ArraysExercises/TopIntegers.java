package ArraysExercises;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numsArray = new int[input.length];


        for (int i = 0; i < numsArray.length; i++) {

          numsArray[i] = Integer.parseInt(input[i]);



        }
        for (int i = 0; i <= numsArray.length - 1; i++) {
            int placeHolder = numsArray[i];
            if (i == numsArray.length - 1){
                System.out.print(placeHolder + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j <= numsArray.length - 1; j++) {
                if (placeHolder > numsArray[j]){
                   isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(placeHolder + " ");
            }
        }


    }
}
