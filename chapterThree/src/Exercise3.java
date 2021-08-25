import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        System.out.print("Enter time in seconds: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int H = x / 60 / 60;
        int M = x % 60 % 60;
        int sec = x - ((H * 3600) + (M * 60));
        System.out.printf("%d seconds is %d hour(s), %d minute(s) and %d second(s).", x, H, M, sec);
    }
}
