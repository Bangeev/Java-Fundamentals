package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(resource)) {
                resourcesMap.put(resource, quantity);
            } else {
                resourcesMap.put(resource, resourcesMap.get(resource) + quantity);

            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
