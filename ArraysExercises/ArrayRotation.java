package ArraysExercises;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String firstIndex = input[0];

            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];

            }
            input[input.length - 1] = firstIndex;

        }
        for (String element : input){
            System.out.print(element + " ");
        }

        
        
    }
}
