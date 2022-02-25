package MapsLambdaAndStreamApiLab;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> countsMap = new LinkedHashMap<>();

        for (String word : words){
            String wordTolower = word.toLowerCase();
            if (!countsMap.containsKey(wordTolower)){
                countsMap.put(wordTolower, 1);
            }else {
                countsMap.put(wordTolower, countsMap.get(wordTolower) + 1);
            }
        }

        List<String> myResult = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 == 1){
                myResult.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", myResult));


    }
}
