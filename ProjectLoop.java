//In this part, the program will ask the user the quantity of
//cupcakes they would like using the while loop.
import java.util.Scanner;
 
class ProjectLoop {
  public static void main(String[] args) {
    int n;
   
    Scanner input = new Scanner(System.in);
    System.out.println("How many cupcakes would you like? ");
   
    while ((n = input.nextInt()) != 0) {
      System.out.println("To confirm, the amount of cupcakes you'd like is " + n);
    }
   
    System.out.println("Sorry, but you've got to order more than that!");
  }
}