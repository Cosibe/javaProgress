import java.util.Scanner;

public class Triangle {
    public static double user(){
        System.out.print("Enter a number for side a: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        System.out.print("Enter a number for side b: ");
        double b = in.nextInt();
        System.out.print("Enter a number for side c: ");
        double c = in.nextInt();

        if (((b+c)<a) || ((a+c)<b) || ((a+b)<c)){
            System.out.println("This is not a triangle");
        } else{
            System.out.println("This is a triangle");
        }
        return 0;
    }
    public static void main(String[] args){
        user();
    }
}
