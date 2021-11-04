import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static int rand(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
    public static int ask(){
        double a = rand();
        System.out.printf("To get the square root of %s, make a guess.", a);
        Scanner ig = new Scanner(System.in); // ig = initial guess
        return ig.nextInt();
    }
    public static double calc(){
         double a = rand();
         int j = ask();
        double guess = ((double) j)/2.0;
        double improvedGuess = (guess + (a/guess))/2;

        while (Math.abs((guess - improvedGuess)) > 0.0001){
            guess = improvedGuess;
            System.out.println(guess);
            improvedGuess = (guess + (a/guess))/2;
            System.out.println(improvedGuess);
        }
        return improvedGuess;

    }
    public static void main(String[] args){
        calc();
    }
}
