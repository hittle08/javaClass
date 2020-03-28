import java.util.Scanner;
import java.text.DecimalFormat;

public class InchConversion {

    public static void main(String[] args) {

        //ask for user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of inches: ");

        //Create inches variable
        int inches = userInput.nextInt();

        

        //Run functions
        inchesToFeet(inches);
        inchesToYards(inches);
    }

    //Convert to feet function
    public static void inchesToFeet(int inches) {
        //formatting decimals
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("With " + inches + " inches, the total amount of feet would be " + (df.format(inches/12.0)) + ".");
    }

    //Convert to inches function
    public static void inchesToYards(int inches) {
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("With " + inches + " inches, the total amount of yards would be " + (df.format(inches/36.0)) + ".");
    }
}