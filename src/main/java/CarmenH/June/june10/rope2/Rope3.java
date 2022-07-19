package main.java.CarmenH;

public class Rope3 {
  public static void swingg() {
    System.out.print("swing ");
  }
  /*
   public static void climbb() { // this should be static // not being static makes an instance
       System.out.println("climb ");
   }

  */

  public static void play() {
    swingg();
    // climbb(); //  static method cannot call instance method
  }

  public static void main(String[] args) {
    Rope3 rope = new Rope3();
    rope.play();
    Rope3 rope2 = null;
    rope2.play(); // here we do not have null exception because play() is static
    // Java looks at the type of the reference for rope2 and translates the call to Rope.play().

    // A null object reference variable is allowed to access
    // a static class variable without throwing an exception either at compile or run time.
  }
}
// if we remove the climbb()  method we have "swing swing " output
