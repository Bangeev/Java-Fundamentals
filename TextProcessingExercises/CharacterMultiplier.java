package TextProcessingExercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder firstNum = new StringBuilder();
        StringBuilder secondNum = new StringBuilder();

        String[] input = scanner.nextLine().split(" ");
        String wordOne = input[0];
        String wordTwo = input[1];


        int result = 0;

        int min = Math.min(wordOne.length(), wordTwo.length());
        int max = Math.max(wordOne.length(), wordTwo.length());

        for (int i = 0; i < max; i++) {
            if (i < min){
                result += wordOne.charAt(i) * wordTwo.charAt(i);
            }else if (wordOne.length() == max){
                result += wordOne.charAt(i);
            }else {
                result += wordTwo.charAt(i);
            }

        }


        System.out.println(result);


    }
}
