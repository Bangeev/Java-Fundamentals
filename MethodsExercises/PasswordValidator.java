package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();

        boolean isValidLength = isValidLength(password);
        boolean isValidCharacters = isValidCharacters(password);
        boolean isValidDigits = isValidDigits(password);

        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidCharacters) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidCharacters && isValidDigits && isValidLength) {
            System.out.println("Password is valid");
        }


    }

    private static boolean isValidLength(String enterPasword) {
        if (enterPasword.length() >= 6 && enterPasword.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidCharacters(String enterPasword) {
        char[] password = enterPasword.toCharArray();
        for (int i = 0; i < password.length; i++) {
            char placeholder = password[i];
            if (!Character.isLetterOrDigit(placeholder)) {
                return false;
            }

        }
        return true;
    }

    private static boolean isValidDigits(String enterPasword) {
        char[] password = enterPasword.toCharArray();
        int count = 0;
        for (int i = 0; i < password.length; i++) {
            char placeholder = password[i];
            if (Character.isDigit(placeholder)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }

        }
        return false;
    }


}
