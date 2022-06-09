package MethodsAndEncapsulation;

/**always remember this order:
 * No_1:if there is a superclass -- initialize first
 * No_2:static variab declarations and static initializers in the order they appear in the file
 * No_3:instance variable declarations and instance initializers in the order they appear in the file
 * No_4:the constructor
 *
 *If there are two or more static/initializer blocks then they are executed in the order in which they appear in the source code.
 */


public class OrderOfInitialization {

    private String initi = "Initialize something";
    {
        System.out.println(initi);
    }

    private String order = "What should be the order of this?";{
        System.out.println(order);
    }

    private String combo = initi + " or " + order;{
        System.out.println(combo);
    }

    private static int counter = 0;
    {
        System.out.println(counter);
    }

    static {counter +=24;
        System.out.println(counter);}

    static{counter -= 24;
        System.out.println(counter);}

    //public void setIniti(String initi) {
    //    this.initi = initi + "....not sure what to do";
   // } this doesn't work--probably cuz it's a public instead of a private




    public OrderOfInitialization(){
        System.out.println("this is a constructor");
    }

    public static void main(String[] args){

        OrderOfInitialization init = new OrderOfInitialization();


    }



}
