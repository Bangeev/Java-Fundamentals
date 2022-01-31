package MethodsLab;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double enterGrade = Double.parseDouble(scanner.nextLine());
        grade(enterGrade);

    }
    public static void grade(double enterGrade){
        String yorGrade = "";
        if (enterGrade >= 2.00 && enterGrade <= 2.99){
            yorGrade = "Fail";
        }else if (enterGrade >= 3.00 && enterGrade <= 3.49){
            yorGrade = "Poor";
        }else if (enterGrade >= 3.50 && enterGrade <= 4.49){
            yorGrade = "Good";
        }else if (enterGrade >= 4.50 && enterGrade <= 5.49){
            yorGrade = "Very good";
        }else if (enterGrade >= 5.50 && enterGrade <= 6.00){
            yorGrade = "Excellent";
        }
        System.out.println(yorGrade);
    }

}
