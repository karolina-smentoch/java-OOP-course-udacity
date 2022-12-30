import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("a-tale-of-two-cities.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        // loop that reads every line into a string
        while (scanner.hasNextLine() == true) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
            // words += adding up all the words in the whole text,
            // counting the number od words in one line, than the second one, the third one and so on,
            // line.splits determine what is the delimiter - here the spaces.
        }
        System.out.println("The file cointains: " + words + " words.");
    }
}
