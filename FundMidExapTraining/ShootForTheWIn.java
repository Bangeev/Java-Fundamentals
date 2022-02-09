package FundMidExapTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int counter = 0;
        String commandIndex = scanner.nextLine();
        while (!commandIndex.equals("End")) {
            int indexToShoot = Integer.parseInt(commandIndex);
            if (indexToShoot >= numsList.size()) {

                commandIndex = scanner.nextLine();

            } else {


                int target = numsList.get(indexToShoot);

                for (int i = 0; i < numsList.size(); i++) {


                    if (i != indexToShoot && numsList.get(i) != -1) {
                        if (numsList.get(i) > target) {
                            numsList.set(i, numsList.get(i) - target);
                        } else {
                            numsList.set(i, numsList.get(i) + target);
                        }
                    }


                }
                numsList.set(indexToShoot, -1);
                counter++;


                commandIndex = scanner.nextLine();
            }
        }

        System.out.print("Shot targets: "+ counter +" -> ");

        for (int element : numsList) {

            System.out.print(element + " ");
        }


    }
}
