//Now we will let the customer order by displaying the menu.
//This will be done using the switch statement.
     class ProjectSwitch {
       public static void main(String args[]) {
         int i;   // int is the data type used with i being the variable name 

       for(i=0; i<12; i++)
     switch(i) {  //The switch method is contained within the ProjectSwitch class
      case 0:
        System.out.println("[_____________________________ALLIYAH'S SPEEDY CUPCAKES MENU______________________________]");
        break;
      case 1:
        System.out.println("Choose your Flour: Gluten-Free / Whole-Wheat / All-Purpose / Bread / Cake");
        break;
      case 2:
        System.out.println("Choose your Oil: Almond / Olive / Canola / Vegetable / Coconut");
        break;     
      case 3:
        System.out.println("Choose your Form of Sugar: Brown / Cane / Honey / Condensed Milk / Stevia Extract / Dark Brown");
        break;
      case 4:
        System.out.println("Choose your Milk: Almond / Soy / 2% Reduced Fat / Fat-Free / Full-Fat / Whole");
        break;
      case 5:
        System.out.println("Choose your Butter: Unsalted / Salted / Margarine");
        break;
      case 6:
        System.out.println("Choose your Cupcake Flavor: Chocolate / Vanilla / Red-Velvet / Cookie-Dough / Oreo / Caramel / Brownie");
        break;
      case 7:
        System.out.println("More Cupcake Flavors: Rasberry / Blueberry / Lemon / Strawberry / Mango / Carrot / Lemon / Coffee");   
        break;
      case 8:
        System.out.println("Choose your Cupcake Topping: Vanilla Frosting / Chocolate Frosting / Whipped Cream / Colored Sugar / Powdered Sugar");
        break;
      case 9:
        System.out.println("More Cupcake Toppings: None / Sprinkles / Oreo / Choco Chips / White Choco Chips / Cherry / Strawberry / Blueberry");   
        break;
      case 10:
        System.out.println("[_____________________________DONE BUILDING? LET US KNOW SO WE CAN SATISFY YOUR HUNGER!_____________________________]");
        break;
       }
    }
}