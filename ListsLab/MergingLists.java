package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        int minlenght = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minlenght; i++) {
            int firstNums = firstList.get(i);
            int secondNums = secondList.get(i);

            resultList.add(firstNums);
            resultList.add(secondNums);
        }

      if (firstList.size() > secondList.size()){
          resultList.addAll(firstList.subList(minlenght, firstList.size()));
      }else {
          resultList.addAll(secondList.subList(minlenght, secondList.size()));
      }
      for (int element : resultList){
          System.out.print(element + " ");
      }




    }
}
