//Import required package.

import java.util.Scanner;

//Define the class ShadyRestRoom.

public class ShadyRestRoom2

{

     //Start the execution of the main() method.

     public static void main(String[] args)

     {

          //Declare the required variables.
          int choice, choice_2 = 0;  
          int room_price = 0;

          //Display the menu of choices.
          System.out.println("Enter 1 for a queen bed");
          System.out.println("Enter 2 for a king bed");
          System.out.println("Enter 3 for a king and a pullout couch");

          //Prompt the user to enter a valid choice using
          //scanner class object.
          System.out.print("\nEnter the choice: ");

          Scanner sc = new Scanner(System.in);
          choice = sc.nextInt();

          //If the user's choice is b/w 1 and 3
          if(choice >=1 && choice <= 3)
          {
               //Display menu of choices for view.
               System.out.println("\nEnter 1 for lake "
               + "view");
               System.out.println("Enter 2 for park " + "view");

               //Prompt the user to select the view.
               System.out.print("\nEnter choice: ");
               choice_2 = sc.nextInt();

               //If user's choice is b/w 1 and 2.
               if(choice_2 >= 1 && choice_2 <= 2){
                     //If choice is 1, then it is a lake
                     //view add 15 to the room price.
                     if(choice_2 == 1){
                          room_price = room_price + 15;
                     }
               }
               //Otherwise, display an appropriate message.
               else{
                     //Assume the selected room has lake
                     //view so update room price.
                     room_price = room_price + 15;
                     System.out.println("\nInvalid view "
                     + "choice!");
               }
               //Display the user's choice.
               System.out.print("\nUser choose " + choice
               + " which is ");
               //If the user's choice is 1, then display
               //the price of queen type room.
               if(choice == 1){
                     room_price = room_price + 125;
                     System.out.print("a queen bed");
                     //If it is a lake view, then display
                     //updated room price.
                     if(choice_2 == 1){
                          System.out.print(" and user "
                          + "choose "
                          + "1 for lake view.");
                          System.out.println("Price of "
                          + "queen "
                          + "bed room with lake view is $"
                          + room_price);
                     }
                     else if(choice_2 == 2){
                          System.out.print(" and user "
                          + "choose "
                          + "2 for park view.");
                          System.out.println("Price of "
                          + "queen "
                          + "bed room with park view is $"
                          + room_price);
                     }
                     else{
                          System.out.println(".");
                          System.out.println("Price of "
                          + "queen "
                          + "bed room with lake view is $"
                          + room_price);
                     }
               }
               //If the user's choice is 2, then display
               //the price of king type room.
               else if(choice == 2){
                     room_price = room_price + 139;
                     System.out.print("a king bed");
                     //If it is a lake view, then display
                     //updated room price.
                     if(choice_2 == 1){
                          System.out.println(" and user "
                          + "choose "
                          + "1 for lake view.");
                          System.out.println("Price of "
                          + "king "
                          + "bed room with lake view is $"
                          + room_price);
                     }
                     else if(choice_2 == 2){
                          System.out.println(" and user "
                          + "choose "
                          + "2 for park view.");
                          System.out.println("Price of "
                          + "king "
                          + "bed room with park view is $"
                          + room_price);
                     }
                     else{
                          System.out.println(".");
                          System.out.println("Price of "
                          + "king "
                          + "bed room with lake view is $"
                          + room_price);
                     }
               }
               //If the user's choice is 3, then display
               //the price of suite with king type bed
               //and pullout couch room.
               else if(choice == 3){
                     room_price = room_price + 165;
                     System.out.print("a suite with king "
                     + "bed and " + "a pullout couch");
                     //If it is a lake view, then display
                     //updated room price.
                     if(choice_2 == 1){
                          System.out.println(" and user "
                          + "choose 1 for lake view.");
                          System.out.println("Price of "
                          + "suite with king "
                          + "bed and pullout couch room "
                          + "with lake view is $"
                          + room_price);
                     }
                     else if(choice_2 == 2){
                          System.out.println(" and user "
                          + "choose 2 for park view.");
                          System.out.println("Price of "
                          + "suite "
                          + "with king "
                          + "bed and pullout couch room "
                          + "with park view is $"
                          + room_price);
                     }
                     else{
                          System.out.println(".");
                          System.out.println("Price of "
                          + "suite with king "
                          + "bed and pullout couch room "
                          + "with lake view is $"
                          + room_price);
                     }
               }
          }
          //Otherwise,
          else{
               //Set the price of room to 0 and
               //display an appropriate message.
               room_price = 0;
               System.out.println("It is an "
               + "invalid choice!");
          }
          //Close the scanner object.
          sc.close();

     }

}