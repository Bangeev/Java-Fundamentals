package TextProcessingExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] myInput = input.toCharArray();
        List<String> inputList = new ArrayList<>();

        for (char element : myInput){
            inputList.add(String.valueOf(element));
        }

        for (int i = 0; i < inputList.size() - 1; i++) {



            if (inputList.get(i).equals(inputList.get(i + 1))){

                inputList.remove(i + 1);
                i--;


            }


        }


        System.out.printf("%s", String.join("", inputList));


    }
}
