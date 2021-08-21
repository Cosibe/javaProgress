import java.text.DecimalFormat;

// question 1
public class Time {
    public static void main(String[] args){
//      question 2
        int hour = 16;
        int min = 40;
        int sec = 0;
        double totalSecs = (hour * 60.0 * 60.0) + (min * 60.0) + sec;

//        question 3
        System.out.println("Number of seconds since midnight is: " + totalSecs);

//        question 4
        double midnight = (24.00 * 60.00 * 60.00);
        double secSinceMidnight = midnight - totalSecs;
        System.out.println("Number of seconds remaining in the day: " + secSinceMidnight);

//        question 5
        double dayPassed = totalSecs / midnight * 100;
        DecimalFormat numFormat = new DecimalFormat("#.00");

        System.out.println("Day that has passed in percentage: " + numFormat.format(dayPassed) + "%");

//        question 6
        double timeSinceStarted = totalSecs - 58325.0;
        double timeStartedMin = timeSinceStarted / 60;
        System.out.println("Time taken to solve exercise two in seconds: " + timeSinceStarted + " while in minutes:" + numFormat.format(timeStartedMin));
//        System.out.println(System.out);
    }
}
