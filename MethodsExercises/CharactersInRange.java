package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        betweenChars(firstChar, secondChar);

    }

    public static void betweenChars(char enterChar, char endChar){

        int startCharacter = Math.min(enterChar, endChar);
        int endCharacter = Math.max(enterChar, endChar);

        for (int i = startCharacter + 1; i < endCharacter; i++) {

            System.out.print((char) i + " ");
        }
    }

}
