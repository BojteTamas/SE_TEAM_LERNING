package CarmenH.classdesignCh5;

public class Fish2 {

  public static void main(String[] args) {
    Fish2 fish = new Fish2();
    //  Bird bird = (Bird)fish; // DOES NOT COMPILE
  }
  /**
   * classes Fish and Bird are not related through any class hierarchy that the compiler is aware
   * of; therefore, the code will not compile.
   */
}
