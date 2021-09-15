import java.util.Scanner;

public class Exercise1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter single digit: ");
        int x = in.nextInt();
        if (x > 0 && x < 10){
            System.out.printf("%d is a positive single digit number", x);
        }
    }
}
