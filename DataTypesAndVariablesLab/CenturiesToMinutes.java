package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        Write a program to enter an integer number of centuries and convert it to years, days, hours, and minutes.
        1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes
*/

        int centuries = Integer.parseInt(scanner.nextLine());
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);




    }
}
