package FundMidExapTraining;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> resultList = new ArrayList<>();
        double avrNum = 0;
        double sumNums = 0;

        for (int i = 0; i < numsList.size(); i++) {
            sumNums += numsList.get(i);

        }
        avrNum = sumNums / numsList.size();

        for (int i = 0; i < numsList.size(); i++) {
            if (avrNum < numsList.get(i)) {
                resultList.add(numsList.get(i));
            }
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);


        if (resultList.size() <= 0){

            System.out.println("No");
            return;


        }

        if (resultList.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(decimalFormat.format(resultList.get(i)) + " ");
            }
        } else {

            for (Double element : resultList) {
                System.out.print(decimalFormat.format(element) + " ");
            }
        }


    }


}
