package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(" : ");


        while (!input[0].equals("end")) {

            String course = input[0];
            String name = input[1];

            if (!coursesMap.containsKey(course)) {
                coursesMap.put(course, new ArrayList<>());

            }
            coursesMap.get(course).add(name);


            input = scanner.nextLine().split(" : ");

        }


        /*for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            int regUsers = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), regUsers);

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("--%s%n", entry.getValue().get(i));
            }
        }*/

        coursesMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(newEntry -> System.out.printf("-- %s%n", newEntry));
        });



    }
}
