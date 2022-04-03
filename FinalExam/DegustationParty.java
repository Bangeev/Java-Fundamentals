package FinalExam;

import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> guestsMenu = new LinkedHashMap<>();
        int count = 0;
        while (!command.equals("Stop")) {

            String[] commandSplit = command.split("-");
            String likeAndDislike = commandSplit[0];
            String guests = commandSplit[1];
            String meal = commandSplit[2];

            if (likeAndDislike.equals("Like")) {

                if (!guestsMenu.containsKey(guests)) {
                    guestsMenu.put(guests, new ArrayList<>());
                    guestsMenu.get(guests).add(meal);

                } else if (!guestsMenu.get(guests).contains((meal))) {
                    guestsMenu.get(guests).add(meal);
                }
            } else if (likeAndDislike.equals("Dislike")) {
                if (!guestsMenu.containsKey(guests)) {
                    System.out.printf("%s is not at the party.%n", guests);
                } else if (!guestsMenu.get(guests).contains(meal)) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", guests, meal);
                } else {
                    guestsMenu.get(guests).remove(meal);
                    System.out.printf("%s doesn't like the %s.%n", guests, meal);
                    count++;
                }
            }

            command = scanner.nextLine();
        }
        for (var kvp : guestsMenu.entrySet()) {
            System.out.printf("%s: %s%n", kvp.getKey(),
                String.join(", ", kvp.getValue()));

        }
        System.out.printf("Unliked meals: %d", count);
    }
}
