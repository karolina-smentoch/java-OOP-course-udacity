
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //chooseTitle();
        convertTitleToUnderscores(chooseTitle());
    }

    // Choosing the title from the given options
    private static String chooseTitle() throws FileNotFoundException {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        List<String> titleList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            titleList.add(scanner.nextLine());
        }
        int numberOfTitles = titleList.size();
        //System.out.println(numberOfTitles);
        Random random = new Random();
        int titleNumber = random.nextInt(numberOfTitles);
        int realNumber = titleNumber + 1;
        titleList.get(titleNumber);
        //System.out.println(realNumber + " " + titleList.get(titleNumber));
        return titleList.get(titleNumber);
    }

    // Changing letters to underscores
    private static String convertTitleToUnderscores(String titleToConvert) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        System.out.println(titleToConvert);
        for (int i = 0; i < titleToConvert.length(); i++) {
            if (titleToConvert.charAt(i) != ' ') {
                builder.append('_');
            } else {
                builder.append(' ');
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}