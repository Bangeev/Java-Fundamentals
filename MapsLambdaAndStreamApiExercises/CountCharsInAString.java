package MapsLambdaAndStreamApiExercises;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
        Map<Character, Integer> countCharMap = new LinkedHashMap<>();

        for (char evryChar : word.toCharArray()){
            if (evryChar == ' '){
                continue;
            }
            if (!countCharMap.containsKey(evryChar)){
                countCharMap.put(evryChar, 1);
            }else {
                countCharMap.put(evryChar, countCharMap.get(evryChar) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
