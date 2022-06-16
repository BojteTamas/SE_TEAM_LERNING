package DragosT;

public class StaticMethodsAndFields {
  public static int count = 0; // static var

  public static void main(String[] args) { // static method
    System.out.println(count);
  } // this is normal main a static method

  // the following line can call this main method in another class
  // StaticMethodsAndFields.main (new String[0]); // it will print 0
  // this is helpful because there is no instantiation needed just to call the method
}
