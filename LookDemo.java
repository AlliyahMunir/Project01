// A short package demonstration.
//This program is created so that the customers are able to give us feedback.
//This program has the ability to do this due to public access in order for
//the package to be used by others. 
package lookpack;
class Look {
  private String question;
  private String info;
  private int pubDate;

  Look(String q, String i, int d) {
    question = q;
    info = i;
    pubDate = d;
   }

   void show() {
     System.out.println(question);
     System.out.println(info);
     System.out.println(pubDate);
     System.out.println();
     }
}

class LookDemo {
  public static void main(String args[]) {
   Look looks[] = new Look[5];

   looks[0] = new Look("------------------------------------FEEDBACK TO MAKE US BETTER-------------------------------------",
                       "Question 1: Does our bakery make you feel at ease or at home? ", 2019);
   looks[1] = new Look("Question 2: How can we improve our service towards customers? ",
                       "Your Initials: ", 2019);
   looks[2] = new Look("Question 3: On a scale of 1 to 10, how would you rate our cupcakes? ",
                       "Your Initials: ", 2019);
   looks[3] = new Look("Question 4: In your opinion, are the cupcakes worth the price?  ",
                       "Your Initials: ", 2019);
   looks[4] = new Look("Question 5: Would you recommend Alliyah's Speedy Cupcakes? If not, why? ",
                       "------------------------THANK YOU FOR FILLING OUT OUR SURVEY! YOUR OPINION MATTERS! ------------------------", 2019);
   for(int i=0; i < looks.length; i++) looks[i].show();
  }
}