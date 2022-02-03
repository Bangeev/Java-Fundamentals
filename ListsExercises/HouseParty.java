package ListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            if (command.get(2).equals("going!")) {

                if (!guestsList.contains(command.get(0))) {

                    guestsList.add(command.get(0));
                } else {
                    System.out.printf("%s is already in the list!%n", command.get(0));
                }

            } else if (command.get(2).equals("not")) {

                if (!guestsList.contains(command.get(0))) {

                    System.out.printf("%s is not in the list!%n", command.get(0));
                }else {
                    guestsList.removeAll(Arrays.asList(command.get(0)));

                }

            }



        }
        for (String element : guestsList){
            System.out.println(element);
        }


    }

}
