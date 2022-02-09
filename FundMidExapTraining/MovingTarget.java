package FundMidExapTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<Integer> placeHolders = new ArrayList<>();

        while (!command.get(0).equals("End")) {

            String firstCommand = command.get(0);
            int secondCommand = Integer.parseInt(command.get(1));
            int thirdCommand = Integer.parseInt(command.get(2));

            if (firstCommand.equals("Shoot")) {
                if (secondCommand < numsList.size() && secondCommand >= 0) {
                    numsList.set(secondCommand, numsList.get(secondCommand) - thirdCommand);
                    if (numsList.get(secondCommand) <= 0) {
                        numsList.remove(secondCommand);
                    }
                }
            } else if (firstCommand.equals("Add")) {
                if (secondCommand < numsList.size() && secondCommand >= 0) {
                    numsList.add(secondCommand, thirdCommand);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (firstCommand.equals("Strike")) {
                if (secondCommand - thirdCommand >= 0 && secondCommand + thirdCommand < numsList.size()) {

                    numsList.subList(secondCommand - thirdCommand, secondCommand + thirdCommand + 1).clear();

                }else {
                    System.out.println("Strike missed!");
                }
            }


            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < numsList.size(); i++) {
            result.add(i, String.valueOf(numsList.get(i)));
        }

        System.out.println(String.join("|", result));
    }
}
