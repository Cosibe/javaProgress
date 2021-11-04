import java.util.Scanner;

public class Sttring {
    public static void main(String[] args){
        System.out.print("Play again? ");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        if (x.equals("yes")){
            System.out.println("Great! we play again");
        } else if(x.equals("no")){
            System.out.println("Ok, bye!");
        } else{
            System.out.println("Pick 'yes' or 'no'");
        }
    }
}
