package TextProcessingExercises;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (Character element : input.toCharArray()){
            int i = element + 3;
            result.append((char) i);

        }


        System.out.println(result);

    }
}
