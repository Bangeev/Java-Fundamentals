package DataTypesAndVariablesExercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i < 'a' + num ; i++) {
            for (char j = 'a'; j < 'a' + num ; j++) {
                for (char k = 'a'; k < 'a' + num ; k++) {

                    System.out.printf("%c%c%c%n",i , j ,k);

                }

            }

        }





    }
}
