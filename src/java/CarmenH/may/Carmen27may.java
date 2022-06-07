package CarmenH.may;

public class Carmen27may {



  public static void main(String[] args) {
       //System.out.println(walk6(6));
    //  walk(1); // passes 1 as start but nothing else. This means Java creates an array of length 0 for nums
  //    walk(1, 2); // passes 1 as start and one more value. Java converts this one value to an array of length 1
   //   walk(1, 2, 3); //passes 1 as start and two more values. Java converts these two values to an array of length 2
    //  walk(1, new int[] {4, 5}); //passes 1 as start and an array of length 2 directly as nums
      //walk(1, null); // throws a NullPointerException


      run(11, 22, 33, 44, 55, 66, 77);

   }
    public static void run(int... nums) {
      System.out.println(nums[5]);
      //System.out.println(nums[1]);
    }
    public static void walk(int start, int... nums) {
       System.out.println(nums.length);
    }
/* example 4
    int integerExpanded() {
        int temp = 9;
        return temp;
  }
/* example3 - doesn't compile
    int long() {
        return 9L;
        }
 */

/* example2
//compiles:
    int integer() {
      return 9;
    }

 */



  /* example1
 static String  walk6(int a) { //why this didn't work if static wasn't there?
        //java: non-static method walk6(int) cannot be referenced from a static context
         //static methods belong to the class, non-static methods belong to instances of the class.
     if (a == 4)
         return ""; //java: missing return statement - daca nu ii pun si ramura de else
    else
        return "elsul";
    }
   */

}
