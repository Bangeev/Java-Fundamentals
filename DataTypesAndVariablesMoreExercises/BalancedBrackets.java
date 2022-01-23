package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOpenBracked = 0;
        int countClosedBracked = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String input = scanner.nextLine();

            if (input.charAt(0) == 40) {
                countOpenBracked++;
            }else if (input.charAt(0) == 41){
                countClosedBracked++;
            }else if (countOpenBracked < countClosedBracked){
                countClosedBracked++;
            }
        }
        if (countOpenBracked != countClosedBracked){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }



    }
}
