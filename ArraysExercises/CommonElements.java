package ArraysExercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        String arrayHolder = "";



        for (int i = 0; i < secondInput.length; i++) {
            arrayHolder = secondInput[i];

            for (int j = 0; j < firstInput.length; j++) {
                if (firstInput[j].equals(arrayHolder)){
                    System.out.print(arrayHolder + " ");
                }
            }

        }





    }
}
