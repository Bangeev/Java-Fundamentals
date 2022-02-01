package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(getMiddleCharacter(input));

    }

    private static Object getMiddleCharacter(String enterString){
        int resultOne = 0;
            int resulTwo = 0;
        int result = 0;
        if (enterString.length() % 2 == 1){
            result = enterString.length() / 2;
            return enterString.charAt(result);
        }else {
            resultOne = enterString.length() / 2 - 1;
            resulTwo = enterString.length() / 2;
            
        }
        return  enterString.charAt(resultOne) + "" + enterString.charAt(resulTwo);
    
        
    }
    


}
