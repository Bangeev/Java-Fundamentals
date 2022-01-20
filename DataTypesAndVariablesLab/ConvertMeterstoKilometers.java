package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMeterstoKilometers {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


//You will be given an integer that will be a distance in meters. Write a program that converts meters to kilometers formatted to the second decimal point.

    int meters = Integer.parseInt(scanner.nextLine());
    double toKm = meters / 1000.0;
        System.out.printf("%.2f", toKm);


    }

}
