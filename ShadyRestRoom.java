import java.util.Scanner;

//Define the class ShadyRestRoom.

public class ShadyRestRoom{
     public static void main(String[] args){

          //variables.
          int choice = 0; 
          int room_price = 0;

          //Display the menu of choices.
          System.out.println("Enter 1 for a queen bed: ");
          System.out.println("Enter 2 for a king bed: ");
          System.out.println("Enter 3 for a king and a pullout couch");    

          //Prompt the user to enter a valid choice using
          //scanner class object.
          System.out.print("\nEnter the choice: ");
          Scanner sc = new Scanner(System.in);
          choice = sc.nextInt();

          //Display the user's choice.
          System.out.print("\nUser choose " + choice + " " + "which is ");

          //If the user's choice is 1, then display the
          //price of queen type room.
          if(choice == 1){
               room_price = 125;
               System.out.println("a queen bed.");
               System.out.println("Price of queen bed" + "room is $" + room_price);
          }
          //If the user's choice is 2, then display the
          //price of king type room.
          else if(choice == 2){
               room_price = 139;
               System.out.println("a king bed.");
               System.out.println("Price of king bed" + "room is $" + room_price);
          }
          //If the user's choice is 3, then display the
          //price of suite with king type bed and pullout
          //couch room.
          else if(choice == 3){
               room_price = 165;
               System.out.println("a suite with king " + "bed and " + "a pullout couch.");
               System.out.println("Price of suite with " + "king " + "bed and pullout couch room "
               + "is $" + room_price);
          } //Otherwise,
          else{
               room_price = 0;
               System.out.println("an invalid choice!");
          }
          sc.close();
     }

}