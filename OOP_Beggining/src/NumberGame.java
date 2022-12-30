import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between [1,100]");
        System.out.println("Try to guess it!");
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            int guess = scanner.nextInt();
            if (guess == random) {
                hasWon = true;
                break;
            } else if (guess > random) {
                System.out.println("It's smaller than " + guess);
            } else {
                System.out.println("It's bigger than " + guess);
            }
        }
        if (hasWon){
            System.out.println("YOU WIN!!! Congrats :)");
        } else {
            System.out.println("GAME OVER! Unfortunately you lose. The correct number is " + random);
        }
    }
}
