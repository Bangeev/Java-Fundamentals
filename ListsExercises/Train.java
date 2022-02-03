package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxPassegers = Integer.parseInt(scanner.nextLine());

        List<String> enterCommand = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!enterCommand.get(0).equals("end")) {

            if (enterCommand.get(0).equals("Add")) {
                numsList.add(Integer.parseInt(enterCommand.get(1)));

            } else {
                for (int i = 0; i < numsList.size(); i++) {

                    if (numsList.get(i) + Integer.parseInt(enterCommand.get(0)) <= maxPassegers) {

                        numsList.set(i, numsList.get(i) + Integer.parseInt(enterCommand.get(0)));
                        break;
                    }
                }

            }


            enterCommand = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        for (int element : numsList){
            System.out.print(element + " ");
        }


    }
}
