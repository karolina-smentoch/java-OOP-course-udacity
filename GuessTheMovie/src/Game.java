import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {

    public static void guessingTheLetter(StringBuilder titleInUnderscores, String originalTitle) {
        Set<Character> wrongLetters = new HashSet<>();
        System.out.println(titleInUnderscores);
        int mistakes = 0;
        while (mistakes < 10 && !isTitleGuessed(titleInUnderscores)) {
            char userChoice = getTheLetterFromTheUser();
            if (originalTitle.indexOf(userChoice) != -1) {
                for (int j = 0; j < titleInUnderscores.length(); j++) {
                    if (userChoice == originalTitle.charAt(j)) {
                        titleInUnderscores.replace(j, j, String.valueOf(userChoice));
                        titleInUnderscores.deleteCharAt(j + 1);
                    }
                }
                System.out.println(titleInUnderscores);
                if (isTitleGuessed(titleInUnderscores)) {
                    System.out.println("CONGRATULATIONS! You won :)");
                }
            } else {
                if (wrongLetters.contains(userChoice)) {
                    System.out.println("The letter " + userChoice + " was already given. Choose another letter.");
                    System.out.println(titleInUnderscores);
                } else {
                    wrongLetters.add(userChoice);
                    mistakes++;
                    System.out.println("You gave (" + mistakes + ") wrong letters. Wrong letters: " + wrongLetters);
                    System.out.println(titleInUnderscores);
                }
            }
            if (mistakes == 10) {
                System.out.println("You've run out of guesses. GAME OVER.");
            }
        }
    }

    private static char getTheLetterFromTheUser() {
        System.out.println("Give your letter:");
        Scanner scanner = new Scanner(System.in);
        char givenLetter = scanner.next().toLowerCase().charAt(0);
        return givenLetter;
    }

    private static boolean isTitleGuessed(StringBuilder titleInUnderscores) {
        return (titleInUnderscores.indexOf("_") == -1);
    }
}
