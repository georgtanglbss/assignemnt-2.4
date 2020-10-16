import java.util.Scanner;

class GuessingGame {

     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random()*100) + 1;
        int tries = 0;
        
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        
        for(int guess = 0;guess != num;tries++){
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            
            if (guess < num) {
                System.out.println("Too low!");
            } else if (guess > num) {
                System.out.println("Too high!");
            }
        }
        System.out.println("You've guessed my number! Good job! It only took you" +tries+ "tries.");
    }
}
