package ListsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        while(!command.get(0).equals("end")){

            if (command.get(0).equals("Delete")){

                numsList.removeAll(Arrays.asList(Integer.parseInt(command.get(1))));
            }else if (command.get(0).equals("Insert")){
                numsList.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        }
        for (int element : numsList){
            System.out.print(element + " ");
        }


    }
}
