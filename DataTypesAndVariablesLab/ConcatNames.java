package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*
        Read two names and a delimiter. Print the names joined by the delimiter.
*/
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstName + delimiter + secondName);



    }
}
