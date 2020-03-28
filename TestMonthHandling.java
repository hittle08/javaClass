import java.time.LocalDate;

public class TestMonthHandling {
    public static void main(String [] args){
        //January 
        LocalDate jan31 = LocalDate.of(2020, 1, 31); 

        //December
        LocalDate dec31 = LocalDate.of(2020, 1, 31); 

        //Print current dates
        System.out.println("Current Date at start: " + jan31); 
        System.out.println("Current Date at start: " + dec31); 

        //Add one month to each date
        jan31 = jan31.plusMonths(1); 
        dec31 = dec31.plusMonths(1); 

        System.out.println("Current Date after 1 months: " + jan31); 
        System.out.println("Current Date after 1 months: " + dec31); 

        //Add two month to each date
        jan31 = jan31.plusMonths(2); 
        dec31 = dec31.plusMonths(2); 

        System.out.println("Current Date after 2 months: " + jan31); 
        System.out.println("Current Date after 2 months: " + dec31); 

        //Add two month to each date
        jan31 = jan31.plusMonths(3); 
        dec31 = dec31.plusMonths(3); 

        System.out.println("Current Date after 3 months: " + jan31); 
        System.out.println("Current Date after 3 months: " + dec31); 

    }
}