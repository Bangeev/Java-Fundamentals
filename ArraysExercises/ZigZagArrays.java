package ArraysExercises;



import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] numsResult = new String[n];
        String[] numsResultSecond = new String[n];

        for (int i = 0; i < n; i++) {
            String[] numsArray = scanner.nextLine().split(" ");
            String firstNUmber = numsArray[0];
            String secondNUmber = numsArray[1];

            if ((i + 1) % 2 == 1){
                numsResult[i] = firstNUmber;
                numsResultSecond[i] = secondNUmber;
            }else {
                numsResult[i] = secondNUmber;
                numsResultSecond[i] = firstNUmber;
            }



        }
        for (String element : numsResult){
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element : numsResultSecond){
            System.out.print(element + " ");
        }
    }
}
