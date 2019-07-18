//Declare an interface in order for the customer
//to let the employee know how they would like to receive their order 
  interface IntDeliver{ 


  public void sayOption();   //The purpose of this program is to let workers become aware of 
                            //how they are delivering the order, whether it be drive through
                            // in person or delivery. 
  }
 
public class JavaInterfaceDeliver implements IntDeliver{
  
  public void sayOption(){
    System.out.println("How would you like to receive your order? Options include: Delivery, In-person, Drive-through ");
  }
  
  public static void main(String args[]){
    //create object of the class
    JavaInterfaceDeliver javaInterfaceDeliver = new JavaInterfaceDeliver();
    //invoke sayOption(), declared in IntDeliver interface.
    javaInterfaceDeliver.sayOption();
  }
}