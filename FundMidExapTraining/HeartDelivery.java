package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numsList = Arrays.stream(scanner.nextLine().split("@"))
            .map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int atIndex = 0;
        while (!command.get(0).equals("Love!")) {

            if (command.get(0).equals("Jump")) {

                atIndex += Integer.parseInt(command.get(1));
                if (atIndex > numsList.size() - 1) {
                    atIndex = 0;
                }
                numsList.set(atIndex, numsList.get(atIndex) - 2);
                if (numsList.get(atIndex) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", atIndex);

                } else if (numsList.get(atIndex) < 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", atIndex);
                }

            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.printf("Cupid's last position was %d.%n", atIndex);
        int count = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) > 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }

    }
}
