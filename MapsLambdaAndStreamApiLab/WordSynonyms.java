package MapsLambdaAndStreamApiLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordSynonymsMap.containsKey(word)){
                wordSynonymsMap.put(word, new ArrayList<>());
                wordSynonymsMap.get(word).add(synonym);
            }else {
                wordSynonymsMap.get(word).add(synonym);
            }

        }

        for (Map.Entry<String, List<String>> entry : wordSynonymsMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }


    }
}
