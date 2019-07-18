 //Declare an interface in order for the customer
//to give a name for the order. 
  interface IntExample{ 


  public void sayOrder();   //The purpose of this program is to let workers become aware of 
                            //whose order they are making, so they can quickly give it when ready
  }
 
public class JavaInterfaceExample implements IntExample{
  
  public void sayOrder(){
    System.out.println("What is the name for your order? ");
  }
  
  public static void main(String args[]){
    //create object of the class
    JavaInterfaceExample javaInterfaceExample = new JavaInterfaceExample();
    //invoke sayOrder(), declared in IntExample interface.
    javaInterfaceExample.sayOrder();
  }
}