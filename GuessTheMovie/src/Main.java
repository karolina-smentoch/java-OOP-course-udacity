import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        GamePreparation.welcomeDescription();
        String title = GamePreparation.chooseTitle();
        Game.guessingTheLetter(GamePreparation.convertTitleToUnderscores(title), title);
    }


}