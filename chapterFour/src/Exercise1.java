public class Exercise1 {
    public static void printAmerican(String day, String month, int date, String coma, int year){
        System.out.print( day);
        System.out.print(month);
        System.out.print(date);
        System.out.print(coma);
        System.out.println(year);

    }

    public static void printEuropean(String day, int date, String month, int year){
        System.out.print( day);
        System.out.print(date);
        System.out.print(month);
        System.out.println(year);

    }

    public static void main(String[] args){
       printAmerican("Monday,", " September ", 6,", ",2021);
       printEuropean("Monday, ", 6, " September, ",2021);
    }
}
