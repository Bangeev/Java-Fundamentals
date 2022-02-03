package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!command.get(0).equals("End")) {

            if (command.get(0).equals("Add")) {

                numsList.add(command.get(1));


            } else if (command.get(0).equals("Insert")) {
                if (Integer.parseInt(command.get(2)) >= 0 && Integer.parseInt(command.get(2)) < numsList.size()) {

                    numsList.add(Integer.parseInt(command.get(2)), command.get(1));
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.get(0).equals("Remove")) {

                if (Integer.parseInt(command.get(1)) >= 0 && Integer.parseInt(command.get(1)) < numsList.size()) {
                    numsList.remove(Integer.parseInt(command.get(1)));
                } else {

                    System.out.println("Invalid index");
                }

            } else if (command.get(1).equals("left")) {
                int count = Integer.parseInt(command.get(2));
                while (count > 0) {
                    String myNum = numsList.get(0);
                    numsList.remove(0);
                    numsList.add(myNum);
                    count--;

                }


            } else if (command.get(1).equals("right")) {
                int count = Integer.parseInt(command.get(2));
                while (count > 0) {
                    String myNum = numsList.get(numsList.size() - 1);
                    numsList.remove(numsList.size() - 1);
                    numsList.add(0, myNum);
                    count--;

                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for (String element : numsList) {
            System.out.print(element + " ");
        }


    }


}

