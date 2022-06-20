package CarmenH.classdesignCh5;

public class Bear {

    public static void eat() {
        System.out.println("Bear is eating"); }

    /**
     * example for breaking the 5th rule:
     */
    public static void sneeze() { //here we have static and will remove it in the child class
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {  // here we do not have static but will add id in the child class
        System.out.println("Bear is hibernating");
    }
}
