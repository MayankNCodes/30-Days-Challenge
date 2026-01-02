import java.util.Scanner;
import java.util.Random;
public class highlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTries = 10;
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        for (int tries = 1; tries < maxTries+1; tries++) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("ATTEMPT["+tries+"] Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("ATTEMPT["+tries+"] Too high!");
            } else {
                System.out.println("ATTEMPT["+tries+"] Congratulations! You've guessed the number!");
                break;
            }
        }

        scanner.close();
    }
}

// OUTPUT:

/* 
Guess a number between 1 and 100: 54
ATTEMPT[1] Too low!
Guess a number between 1 and 100: 70
ATTEMPT[2] Too low!
Guess a number between 1 and 100: 80
ATTEMPT[3] Too low!
Guess a number between 1 and 100: 90
ATTEMPT[4] Too low!
Guess a number between 1 and 100: 99
ATTEMPT[5] Too high!
Guess a number between 1 and 100: 98
ATTEMPT[6] Too high!
Guess a number between 1 and 100: 95
ATTEMPT[7] Too low!
Guess a number between 1 and 100: 96
ATTEMPT[8] Too low!
Guess a number between 1 and 100: 97
ATTEMPT[9] Congratulations! You've guessed the number!*/
