import java.util.Scanner;

public class Quadratic {
    public static int a(){
        System.out.println("Enter value for a: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int b(){
        System.out.println("Enter value for b: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int c(){
        System.out.println("Enter value for c: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static void main(String[] args){
        int m = a();
        int n = b();
        int p = c();
        double pow = Math.pow(n, 2);

        int x = (-n +- ((int) Math.sqrt(pow - (4*m*p))))/ (2*m);
        System.out.println(x);
    }
}
