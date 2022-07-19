package CarmenH.June.june01;

public class Carmen01jun {

  /*
     //5th example - Pass-by-reference - this is not in Java written - is confusing - why not in java?
     original1 = 1;
     original2 = 2;
     swapByReference(original1, original2);
     print(original1);
     print(original2);
     swapByReference(a, b) {
         temp = a;
         a = b;
         b = temp;
     }
  */

  /*
     //4th example - Pass-by-value example:
     public static void main(String[] args) {

         int original1 = 1;
         int original2 = 2;
         swap(original1, original2);
         System.out.println(original1);
         System.out.println(original2);
     }
     public static void swap(int a, int b) {
         //In this example, the swap method does not change the original values. It only changes a and b within the method.
         int temp = a;
         a = b;
         b = temp;
     }


  */

  /*
     //3rd example
     public static void main(String[] args) {
         StringBuilder name = new StringBuilder();
         speak(name);
         System.out.println(name); // Webby
     }
     public static void speak(StringBuilder s) {
         s.append("Webby"); }
     //In this case, the output is Webby because the method merely calls a method on the parameter.
     // It doesn’t reassign name to a different object.

  */

  /*
  //an example with a reference type. 2nd example
      public static void main(String[] args) {
      String name = "Webby";
      speak(name);
      System.out.println(name);
  }
      public static void speak(String name) {
          name = "Sparky";
      }
      //Just as in the primitive example, the variable assignment is only to the method parameter and doesn’t affect the caller.

   */

  /* this is an example with primitives. 1st example
     public static void main(String[] args) {
         int num = 4;
         newNumber(5);
         System.out.println(num);
     }

     public static void newNumber(int num) {
         num = 8;
     }

  */
}
