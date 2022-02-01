package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = List.of(scanner.nextLine().split(" "));
        while (!command.get(0).equals("end")) {


            switch (command.get(0)) {
                case "Add":
                    numsList.add(Integer.valueOf(command.get(1)));
                    break;
                case "Remove":
                    numsList.remove(Integer.valueOf(command.get(1)));
                    break;
                case "RemoveAt":
                    numsList.remove(Integer.parseInt(command.get(1)));
                    break;
                case "Insert":
                    numsList.add(Integer.parseInt(command.get(2)), Integer.valueOf(command.get(1)));
                    break;

            }
            command = List.of(scanner.nextLine().split(" "));
        }

        for (int elements : numsList){
            System.out.print(elements + " ");
        }

    }
}
