import java.util.Scanner;
//A program that will use operator and classes
class ProjectOperator&Class {
 int price; //price of the cupcake
 }

//The purpose of this is to calculate the total price of cupcakes
//with the help of the customer inputting the quanity of cupcakes
//they bought. This program is an operator because multiplication is
//used and this program contains more than one class. 

public class ProjectOperator&ClassDemo {

    public static void main(String[] args) {

       ProjectOperator cupcake = new ProjectOperator();
       int range;

       // assign values to the cupcake product items
        cupcake.price = 3;
        Scanner scan = new Scanner(System.in);
        System.out.print("To pay, please enter the number of cupcakes you bought: ");

        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();
        
        // Calculating product of two numbers
        range = num1*cupcake.price;
        
        // Displaying the multiplication result
        System.out.println("Your total comes out to $"+range);
    }
}
