package FundMidExapTraining;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> placeHolder = new ArrayList<>();
        while (!command.get(0).equals("Yohoho!")) {

            switch (command.get(0)) {
                case "Loot":
                    for (int i = 1; i < command.size(); i++) {
                        if (!loot.contains(command.get(i))) {
                            loot.add(0, command.get(i));
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(command.get(1)) >= 0 && Integer.parseInt(command.get(1)) < loot.size()) {
                        String removed = loot.get(Integer.parseInt(command.get(1)));

                        loot.remove(Integer.parseInt(command.get(1)));
                        loot.add(removed);

                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command.get(1));

                    if (count > loot.size()) {
                        count = loot.size();
                    }

                    List<String> subList = loot.subList(loot.size() - count, loot.size());

                    System.out.println(String.join(", ", subList));

                    loot = loot.subList(0, loot.size() - count);
                    break;
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        if (!loot.isEmpty()) {
            String placeHold = loot.toString().replaceAll("[\\[\\],\\s+]", "");


            System.out.printf("Average treasure gain: %.2f pirate credits.", placeHold.length() * 1.0 / loot.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }


    }
}
