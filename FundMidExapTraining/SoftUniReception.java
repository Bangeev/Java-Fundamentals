package FundMidExapTraining;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstEmplEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmplEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmplEfficiency = Integer.parseInt(scanner.nextLine());

        int sumEmpl = firstEmplEfficiency + secondEmplEfficiency + thirdEmplEfficiency;

        int studentCount = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (studentCount > 0){
            studentCount = studentCount - sumEmpl;
            counter++;

            if (counter % 4 == 0){
                counter++;
            }

        }
        System.out.printf("Time needed: %dh.", counter);


    }
}
