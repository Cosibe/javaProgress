public class Bool {
    public static boolean isSingleDigit(int x){
        return x > -10 && x < 10;
    }
    public static void main(String[] args){
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(17);
    }
}
