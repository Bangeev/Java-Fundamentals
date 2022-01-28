package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        int[] field = new int[fieldSize];

        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int ladyBugIndex : ladyBugsIndexes){
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")){


            String[] tokens = command.split(" ");

            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLenght = Integer.parseInt(tokens[2]);


            if (index >= 0 && index <= field.length - 1 && field[index] == 1){

                field[index] = 0;
                if (direction.equals("right")){
                    index += flyLenght;

                    while (index <= field.length - 1 && field[index] == 1){
                        index += flyLenght;
                    }


                    if(index <= field.length - 1){
                        field[index] = 1;
                    }

                }else if (direction.equals("left")){

                    index -= flyLenght;

                    while (index >= 0 && field[index] == 1){
                        index -= flyLenght;
                    }
                    if (index >= 0 ){
                        field[index] = 1;
                    }
                }
            }
            command = scanner.nextLine();

        }
        for (int number : field){
            System.out.print(number + " ");
        }


    }
}
