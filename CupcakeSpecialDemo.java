// Add more constructors to CupcakeSpecial.
//This program is created to allow the user to become informed of the specials
//at Alliyah's Speedy Bakery. Currently, this menu is only for August and display the 
//amount of cupcakes and price the customer would be paying for the cupcake. This is 
//taken place with the use of the inheritance method. 
class CupcakeSpecial {
   private double price;
   private double quantity;

// A default constructor.
CupcakeSpecial() {
  price = quantity = 0.0;
}

// Parameterized constructor.
CupcakeSpecial(double p, double q) {
  price = p;                   
  quantity = q;
}

// Construct object with equal width and height.
CupcakeSpecial(double x) {
  price = quantity = x;
 }

// Accessor methods for width and height.
double getPrice() { return price; }
double getQuantity() { return quantity; }
void setWidth(double p) { price = p; }
void setHeight(double q) {quantity = q;}

  void showDim() {
    System.out.println("The total price will be $" +
                       price + " when the amount of cupcakes ordered is " + quantity);
   }
}

// A subclass of CupcakeSpecial for triangles. 
class Total extends CupcakeSpecial {    //Total inherits CupcakeSpecial
  private String style;

  // A default constructor.
  Total() {
    super();
   style = "none";
}

//Constructor
Total(String s, double p, double q) {
  super(p, q); // call superclass constructor, which is used to access objects

  style = s;
}

// One argument constructor.
Total(double x) {
  super(x); // call superclass constructor

  style = "filled";
}

double area() {
  return getPrice() * getQuantity();    //Total can refer to CupcakeSpecial as if part of Total
}

   void showStyle() {
     System.out.println("------------------------AUGUST SPECIAL ONLY--------------" + style);
   }
}

class CupcakeSpecialDemo {        //This class declares an object of type CupcakeSpecial
  public static void main(String args[]) {
     Total t1 = new Total("----------", 2.75, 3);
     Total t2 = new Total("----------", 1 , 1);  
     Total t3 = new Total("----------", 2, 2);

     System.out.println("Monday Special: Stay awake at work by purchasing 3 filled coffee cupcakes and get 10% off! ");
     t1.showStyle(); 
     t1.showDim();
     System.out.println("Your total w/o tax is $" + t1.area());  

     System.out.println();

     System.out.println("Thursday Special: Take a break from your diet and have a chocolate cupcake for $1! ");
     t2.showStyle(); 
     t2.showDim();
     System.out.println("Your total w/o tax is $" + t2.area());

     System.out.println();

     System.out.println("Sunday Special: Make a friend and buy them a vanilla sprinkle cupcake with our special of $2 for 2 cupcakes! ");
     t3.showStyle(); 
     t3.showDim();
     System.out.println("Your total w/o tax is $" + t3.area());

     System.out.println();
    }
}

   