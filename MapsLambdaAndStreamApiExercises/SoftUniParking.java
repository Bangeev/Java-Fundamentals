package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];


            switch (command) {
                case "register":
                    String plateNumber = input[2];
                    if (!registeredMap.containsKey(name)) {
                        registeredMap.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);

                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                    }
                    break;

                case "unregister":

                    if (!registeredMap.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        System.out.printf("%s unregistered successfully%n", name);
                        registeredMap.remove(name);
                    }
                    break;

            }
        }
        registeredMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));


    }
}
