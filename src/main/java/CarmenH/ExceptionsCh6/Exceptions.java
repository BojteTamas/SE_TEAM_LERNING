package CarmenH.ExceptionsCh6;

public class Exceptions {
    public static void main(String[] args) {
        visitPorcupine();
        visitMonkeys();
        visitSnakes();
    }

    static void visitPorcupine() {
        try {
            seeAnimal(); // foooound IT !
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.println("try back later");
        } catch (ExhibitClosed e) { // second catch block
            System.out.println("not today");
        }
    }

    static void seeAnimal() { // the method should throw the exception
        throw new ExhibitClosed();
    }

    static void seeAnimalTWO() { // the method should throw the exception
        throw new ExhibitClosedForLunch();
    }

    public static void visitMonkeys() {

        try {
            seeAnimalTWO();
        } catch (ExhibitClosedForLunch e) {  // subclass exception
            System.out.println("try back later");
        } catch (ExhibitClosed e) {  // superclass exception
            System.out.println("not today");
        }


      /**
       * if we change the order we have this commented block that doesn't compile
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE because this was already caught by the first block
            System.out.print("try back later"); }
       */
    }

    public static  void visitSnakes() { //added static
        try {
            seeAnimal();
            } catch (RuntimeException e) {
                System.out.println("runtime exception");
             } // catch (ExhibitClosed e) {// DOES NOT COMPILE - this is a RuntimeException exception - so already caught in the first block
              //  System.out.print("not today");
             //}
             catch (Exception e) {
                System.out.println("exception"); }
    }
}