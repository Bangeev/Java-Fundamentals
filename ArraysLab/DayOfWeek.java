package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings

        int num = Integer.parseInt(scanner.nextLine());

        String[] arr = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if (num >= 1 && num <= 7) {

            System.out.println(arr[num - 1]);
        }else {
            System.out.println("Invalid day!");
        }




    }
}
