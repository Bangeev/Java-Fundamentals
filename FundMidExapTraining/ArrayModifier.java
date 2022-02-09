package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> commands = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int secondCommand = 0;
        int thirdCommand = 0;
        int firstNum = 0;
        int secondNum = 0;
        while (!commands.get(0).equals("end")) {
            String firstCommand = commands.get(0);
            if (commands.size() != 1) {
                secondCommand = Integer.parseInt(commands.get(1));
                thirdCommand = Integer.parseInt(commands.get(2));

                firstNum = numsList.get(secondCommand);
                secondNum = numsList.get(thirdCommand);
            }

            if (firstCommand.equals("swap")) {

                numsList.set(secondCommand, secondNum);
                numsList.set(thirdCommand, firstNum);

            } else if (firstCommand.equals("multiply")) {
                numsList.set(secondCommand, firstNum * secondNum);


            } else if (firstCommand.equals("decrease")) {
                for (int i = 0; i < numsList.size(); i++) {
                    numsList.set(i, numsList.get(i) - 1);
                }
            }

            commands = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(String.join(", ",numsList.toString().replaceAll("[\\[\\]]", "")));


    }
}
