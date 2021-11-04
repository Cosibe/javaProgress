public class Abecedarian {
//    public static String intake(){
//        Scanner in = new Scanner(System.in);
//        return in.nextLine();
//    }
    public static boolean isAbecedarian(){
        String x = "nora";
        char letter = x.charAt(0);
        char nextLetter;
        for(int i = 0; i <= x.length()-1; i++){
            nextLetter = x.charAt(i);
            if (nextLetter < letter) {
                System.out.printf("%s is not abecedarian.\n", x);
                return false;
            } else {
                System.out.printf("%s is abecedarian\n", x);
            }
            letter = nextLetter;
        }
        return true;
    }
    public static void main(String[] args){
        isAbecedarian();
    }
}
