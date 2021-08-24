import java.util.Scanner;
/**
 * Converts centimetres to feet and inches.
 **/

public class Convert {
    public static void main(String[] args){
//        double cm;
//        int feet, inches, remainder;
//        final double CM_PER_INCH = 2.54;
//        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // Prompt the user and get the value
//        System.out.print("Exactly how many cm? ");
//        cm = in.nextDouble();

        // Converts and output the result
//        inches = (int) (cm / CM_PER_INCH);
//        feet = inches / IN_PER_FOOT;
//        remainder = inches % IN_PER_FOOT;
//        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
        System.out.println("What is your age?");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("What is your name");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
