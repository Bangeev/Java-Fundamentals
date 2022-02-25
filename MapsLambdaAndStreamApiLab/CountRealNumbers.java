package MapsLambdaAndStreamApiLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countsMap = new TreeMap<>();

        for (double num : numsList){
            if (!countsMap.containsKey(num)){
                countsMap.put(num, 0);
            }
            countsMap.put(num, countsMap.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : countsMap.entrySet()) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()), entry.getValue());
        }


    }
}
