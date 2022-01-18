package BasicSyntaxConditionalStatementsandLoopsExercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amouthOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

//Adding 10% more to lightsabers becaouse they break;
        double countOfLightsabersBecauseOfBreak = Math.ceil(countOfStudents * 1.10);
        int countBelthForEvrySixBelts = countOfStudents - countOfStudents / 6;

        double totalPrice =priceOfLightsaber * countOfLightsabersBecauseOfBreak + priceOfRobe *countOfStudents + priceOfBelt * countBelthForEvrySixBelts;
        if (amouthOfMoney >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - amouthOfMoney);
        }


    }
}
