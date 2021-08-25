import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        System.out.print("Enter a temperature in Celsius: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        final double m = (double) (9 / 5) + 32;
        double F = x * m;
        System.out.printf("%.2fC = %.2fF", x, F);
    }
}
