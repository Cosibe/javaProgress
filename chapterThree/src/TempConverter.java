import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        System.out.print("Enter a temperature in Celsius: ");
        Scanner in = new Scanner(System.in);
        double C = in.nextDouble();
        final double m = (9.0 / 5.0) + 32.0;
        double F = C * m;
        System.out.printf("%.2fC = %.2fF", C, F);
    }
}
