package MapsLambdaAndStreamApiExercises;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());

            }

            studentsMap.get(name).add(grade);

        }


        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {

            List<Double> avr = entry.getValue();

            double avrGrade = 0;
            for (Double grade : avr) {
                avrGrade += grade;
            }
            avrGrade /= entry.getValue().size();


            if (avrGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), avrGrade);

            }
        }


    }
}
