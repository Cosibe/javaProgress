import java.util.Scanner;

public class Fermat {
    public static int fermat(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a figure for 'a': ");
        int a = in.nextInt();
        System.out.println("Enter a figure for 'b': ");
        int b = in.nextInt();
        System.out.println("Enter a figure for 'c': ");
        int c = in.nextInt();
        System.out.println("Enter a figure 'n': ");
        int n = in.nextInt();
        int x = (int) Math.pow(a, n);
        int y = (int) Math.pow(b, n);
        int z = (int) Math.pow(c, n);
        int m = x + y;
        System.out.println(m);
        System.out.println(z);
        if ((m == z) && n < 2){
            System.out.println("Holy smokes! Fermat was right.");
        }
        else{
            System.out.println("Fermat was wrong!");
        }
        return x + y;
    }
    public static void main(String[] args){
        fermat();

    }
}
