package MethodsExercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterWord = scanner.nextLine().toLowerCase();
    printHowMuchVowelsAreInWord(enterWord);

    }
    public static void printHowMuchVowelsAreInWord(String input){

        int count = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'|| input.charAt(i) == 'u' ){
                count++;
            }

        }
        System.out.println(count);
    }
}
