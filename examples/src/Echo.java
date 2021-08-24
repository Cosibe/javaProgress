import java.util.Scanner;

public class Echo {
    public static void main(String[] args){
//        String line;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Type something: ");
//        line = in.nextLine();
//        System.out.println("You said: " + line);
//
//        System.out.print("Type something else: ");
//        line = in.nextLine();
//        System.out.println("You also said: " + line);

        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.print(inch + "inch = ");
        System.out.println(cm + "cm");
    }
}
