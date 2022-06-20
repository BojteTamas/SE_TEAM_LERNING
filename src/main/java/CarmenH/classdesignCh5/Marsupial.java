package CarmenH.classdesignCh5;

public class Marsupial {

  //  public static boolean isBiped() {
  //      return false;
  //  }
  public boolean isBiped() { //commenting the version with static for the example with overriding
           return false;
       }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
