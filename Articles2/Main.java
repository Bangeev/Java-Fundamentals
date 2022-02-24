package ObjectAndClassesExercises.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        List<Article> myArticles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] article = scanner.nextLine().split(", ");
            Article articleTwo = new Article(article[0], article[1], article[2]);

            myArticles.add(articleTwo);


        }
        String command = scanner.nextLine();


            switch (command) {
                case "title":
                    myArticles.sort(Comparator.comparing(Article::getTitle));
                   break;
                case "content":
                    myArticles.sort(Comparator.comparing(Article::getContent));
                    break;
                case "author":
                    myArticles.sort(Comparator.comparing(Article::getAuthor));
                    break;
            }

            for (Article article : myArticles) {
                System.out.println(article);
            }


        }

}
