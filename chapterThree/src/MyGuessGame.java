import java.util.Random;
import java.util.Scanner;

public class MyGuessGame {
    public static void main(String[] args){
//        pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.printf("Your guess is %d", x);
        System.out.printf("\nThe number I was thinking of is %s", number);
        System.out.println("\nYou were off by: " + (x - number));
    }
}

