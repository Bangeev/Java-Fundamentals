package ObjectAndClassesExercises.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");

        int n = Integer.parseInt(scanner.nextLine());

        Article articleObj = new Article(article[0], article[1], article[2]);

        for (int i = 0; i < n; i++) {

            String[] commandArr = scanner.nextLine().split(": ");

            String command = commandArr[0];
            String value = commandArr[1];

            switch (command){
                case "Edit" :
                    articleObj.setContent(value);
                    break;
                case "ChangeAuthor" :
                    articleObj.setAuthor(value);
                    break;
                case  "Rename" :
                    articleObj.setTitle(value);
                    break;
            }




        }
        System.out.println(articleObj);

    }
}
