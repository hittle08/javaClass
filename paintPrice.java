import java.util.Scanner;

//Change class name to InchConversion
public class paintPrice {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        double caculateWallArea = 0;
        double totalPaint = 0; 
        double height = 0;
        double length = 0;
        double width = 0;
        double price = 0;
        double areaOfWall = 0;
        double paint = 0;
        
        
        //Ask user for length of a rectangular room 
        System.out.print("Input the length of the room: ");
        length = keyboard.nextDouble();
        
        //Ask user for width of a rectangular room 
        System.out.print("Input the width of the room: ");
        width = keyboard.nextDouble();
    
        //Ask user for height of a rectangular room 
        System.out.print("Input the height of the room: ");
        height = keyboard.nextDouble();
        
        //Print area of the wall
        double area = caculateWallArea(height, length, width);
        System.out.println("The area of the room is "+ area);
        double costOfPaint = totalPaint(area); 
        System.out.println("The total price of the paint is " + costOfPaint);
        
        
    }
    
    /*-----------------------------------------------------------------------------*/
    //Calculates the wall area for a room
    public static double caculateWallArea(double height, double length, double width){
        double areaOfWall1 = length * height * 2;
        double areaOfWall2 = width * height * 2; 
        double totalSpace = areaOfWall1 + areaOfWall2; 
        return totalSpace;
    }


    /*-----------------------------------------------------------------------------*/
    //Calulates the amount of paint for the room. 
    public static double totalPaint(double area){
        double paint = area / 350;
        
        //caculate price
        double price = paint * 32.0;
        //return price;
        return price; 
    }
}