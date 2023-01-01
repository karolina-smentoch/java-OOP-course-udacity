
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //chooseTitle();
        //convertTitleToUnderscores(chooseTitle());
        String title = chooseTitle();
        guessingTheLetter(convertTitleToUnderscores(title), title);
    }

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

    private static StringBuilder convertTitleToUnderscores(String titleToConvert) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        //System.out.println(titleToConvert);
        for (int i = 0; i < titleToConvert.length(); i++) {
            if (titleToConvert.charAt(i) != ' ') {
                builder.append('_');
            } else {
                builder.append(' ');
            }
        }
        //System.out.println(builder.toString());
        return builder;
    }

    private static void guessingTheLetter(StringBuilder titleInUnderscores, String originalTitle) {
        Set<Character> wrongLetters = new HashSet<>();
        //System.out.println(originalTitle);
        System.out.println(titleInUnderscores);
        int mistakes = 0;
        while (mistakes < 10 && !isTitleGuessed(titleInUnderscores)) {
            char userChoice = getTheLetterFromTheUser();
            if (originalTitle.indexOf(userChoice) != -1) {
                //System.out.println("There is no letter '" + userChoice + "' in the title. You have " + guessesLeft + " guesses left.");
                for (int j = 0; j < titleInUnderscores.length(); j++) {
                    if (userChoice == originalTitle.charAt(j)) {
                        titleInUnderscores.replace(j, j, String.valueOf(userChoice));
                        titleInUnderscores.deleteCharAt(j + 1);
                        // System.out.println(titleInUnderscores.toString());
                    }
                }
                System.out.println(titleInUnderscores.toString());
                if (isTitleGuessed(titleInUnderscores)) {
                    System.out.println("CONGRATULATIONS! You won :)");
                }
            } else {
                if (wrongLetters.contains(userChoice)) {
                    System.out.println("The letter " + userChoice + " was already given. Choose another letter.");
                    System.out.println(titleInUnderscores.toString());
                } else {
                    wrongLetters.add(userChoice);
                    mistakes++;
                    System.out.println("You gave (" + mistakes + ") wrong letters. Wrong letters: " + wrongLetters);
                    System.out.println(titleInUnderscores.toString());
                }
            }
            if (mistakes == 10) {
                System.out.println("You've run out of guesses. GAME OVER.");
            }
        }
    }

    private static char getTheLetterFromTheUser() {
        System.out.println("Give your letter");
        Scanner scanner = new Scanner(System.in);
        String givenletterInString = scanner.nextLine();
        char givenLetter = givenletterInString.charAt(0);
        return givenLetter;
    }

    private static boolean isTitleGuessed(StringBuilder titleInUnderscores) {
        return (titleInUnderscores.indexOf("_") == -1);
    }
}