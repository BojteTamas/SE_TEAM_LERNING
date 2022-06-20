package CarmenH.classdesignCh5;

public class Kangaroo extends Marsupial{

  //  public static boolean isBiped() { // commenting this for example2 , with overriding
    //    return true;
   // }
//the following method is overriding, not hidden
    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription(); //this one is a call to parent class method isBiped()
        joey.getKangarooDescription(); // this one is a call to child class method isBiped()
        // child executes a method of isBiped(),
        // which hides the parent method’s version and returns true.
    }
}
/**
 * this is an example for hidding
 *
 * the parent version of a hidden method is always executed
 * if the call to the method is defined in the parent class.
 */
