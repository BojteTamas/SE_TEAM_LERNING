package CarmenH.classdesignCh5;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
        /**
         * this is the method that hides the one in the parent class

         */
    }
    public static void main(String[] args) {
        Panda.eat();
    }

    /**
     * here are the examples of hiding static rules that break the 5th rule:
     *
     * public void sneeze() { // DOES NOT COMPILE - because in parent class is static and here is not
     *      System.out.println("Panda bear sneezes quietly");
     * }
     * public static void hibernate() { // DOES NOT COMPILE  - because in parent class is not static and here it is static
     *      System.out.println("Panda bear is going to sleep");
     * }
     */
}
