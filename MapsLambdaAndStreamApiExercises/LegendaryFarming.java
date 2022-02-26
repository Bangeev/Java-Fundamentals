package MapsLambdaAndStreamApiExercises;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> legendaryItemsMap = new LinkedHashMap<>();
        legendaryItemsMap.put("shards", 0);
        legendaryItemsMap.put("fragments", 0);
        legendaryItemsMap.put("motes", 0);

        Map<String, Integer> junkItemsMap = new LinkedHashMap<>();


        boolean isTaken = false;
        while (!isTaken) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            int numItem = 0;
            String item = "";


            for (int i = 0; i < input.size(); i+=2) {

                    numItem = Integer.parseInt(input.get(i));
                    item = input.get(i + 1).toLowerCase();


                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {

                        legendaryItemsMap.put(item, legendaryItemsMap.get(item) + numItem);

                    if (legendaryItemsMap.get(item) >= 250) {
                        legendaryItemsMap.put(item, legendaryItemsMap.get(item) - 250);
                        if (item.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (item.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isTaken = true;
                        break;
                    }
                } else {
                    if (!junkItemsMap.containsKey(item)) {
                        junkItemsMap.put(item, numItem);
                    } else {
                        junkItemsMap.put(item, junkItemsMap.get(item) + numItem);
                    }
                }
            }



        }

        for (Map.Entry<String, Integer> entry : legendaryItemsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


        for (Map.Entry<String, Integer> entry : junkItemsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }
}
