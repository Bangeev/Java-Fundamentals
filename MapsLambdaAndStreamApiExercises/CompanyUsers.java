package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(" -> ");
        while (!input[0].equals("End")){

            String company = input[0];
            String id = input[1];

            if (!companyMap.containsKey(company)){
                companyMap.put(company, new ArrayList<>());

            }
            if (!companyMap.get(company).contains(id)) {
                companyMap.get(company).add(id);
            }





            input = scanner.nextLine().split(" -> ");
        }

        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }


    }
}
