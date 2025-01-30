import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: Rock, Paper, or Scissors");
        System.out.print("Your choice: ");
        String userChoice = scanner.nextLine().toLowerCase();
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice = options[random.nextInt(3)];
        System.out.println("Computer's choice: " + computerChoice);
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            System.out.println("You lose!");
        } else {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
        }
        scanner.close();
    }
}

