package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> ordersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            Double price = Double.parseDouble(input.split(" ")[1]);
            Double quantity = Double.parseDouble(input.split(" ")[2]);
            if (!ordersMap.containsKey(name)){
                ordersMap.put(name, new ArrayList<>());
                ordersMap.get(name).add(price);
                ordersMap.get(name).add(quantity);
            }else{
              ordersMap.get(name).set(0, price);
              ordersMap.get(name).set(1, ordersMap.get(name).get(1) + quantity);
            }



            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<Double>> entry : ordersMap.entrySet()) {
            entry.getValue().add(entry.getValue().get(0) * entry.getValue().get(1));

            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue().get(2));
        }


    }
}
