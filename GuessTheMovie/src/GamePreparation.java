import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GamePreparation {

    public static String chooseTitle() throws FileNotFoundException {
        List<String> titleList = getListOfTitles();
        int numberOfTitles = titleList.size();
        Random random = new Random();
        int titleNumber = random.nextInt(numberOfTitles);
        titleList.get(titleNumber);
        return titleList.get(titleNumber);
    }

    public static StringBuilder convertTitleToUnderscores(String titleToConvert) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < titleToConvert.length(); i++) {
            if (titleToConvert.charAt(i) != ' ') {
                builder.append('_');
            } else {
                builder.append(' ');
            }
        }
        return builder;
    }

    public static void welcomeDescription (){
        System.out.println("Welcome in game 'Guess The Movie'!");
        System.out.println("Your task is to guess the title of the movie hidden behind the underscores by guessing one letter at a time.");
        System.out.println("So even if you write few letters only the first one will be taken into account.");
        System.out.println("If you make 10 mistakes - game over.");
        System.out.println("Good luck and may the force be with you ;)");
        System.out.println("*************************************************************************************************************");
    }

    private static List<String> getListOfTitles() throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        List<String> titleList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            titleList.add(scanner.nextLine());
        }
        return titleList;
    }
}
