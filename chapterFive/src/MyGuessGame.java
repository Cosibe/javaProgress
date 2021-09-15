import java.util.Random;
import java.util.Scanner;

public class MyGuessGame {
    public static int rand(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static int guess (){
        System.out.println("\nI am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("\nType a number: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static void condition(){
        int x = guess();
        int z = rand();
        int i = 0;
        boolean m = false;
       while (!m && i < 3){
           i++;
           guess();
           if (x == z){
               System.out.println("Your guess is  correct!");
               m = true;
           }
           else if (x < z){
               System.out.println("Your guess is low!");
           }
           else{
               System.out.println("Your guess is low!");
               return;
           }
       }
    }
    public static void main(String[] args){
        condition();
    }
}
