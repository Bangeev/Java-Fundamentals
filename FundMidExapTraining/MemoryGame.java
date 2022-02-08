package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int countMoves = 0;
        int size = elementsList.size();


        while (!commandList.get(0).equals("end")) {
            countMoves += 1;

            int firstIndex = Integer.parseInt(commandList.get(0));
            int secondIndex = Integer.parseInt(commandList.get(1));


            if (commandList.get(0).equals(commandList.get(1))
                || firstIndex < 0
                || firstIndex >= elementsList.size()
                || secondIndex < 0
                || secondIndex >= elementsList.size()) {


                elementsList.add(elementsList.size() / 2, "-" + countMoves + "a");

                elementsList.add(elementsList.size() / 2, "-" + countMoves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (elementsList.get(firstIndex).equals(elementsList.get(secondIndex))) {
                String elementOne = elementsList.get(firstIndex);
                String elementTwo = elementsList.get(secondIndex);


                elementsList.remove(elementOne);
                elementsList.remove(elementTwo);
                System.out.printf("Congrats! You have found matching elements - %s!%n", elementOne);

            } else if (elementsList.get(firstIndex) != elementsList.get(secondIndex)) {

                System.out.println("Try again!");

            }


            if (elementsList.size() == 0) {
                System.out.printf("You have won in %d turns!", countMoves);
                break;
            }
            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        if (commandList.get(0).equals("end")) {
            System.out.println("Sorry you lose :(");
            for (String element : elementsList) {
                System.out.print(element + " ");
            }
        }
    }
}

