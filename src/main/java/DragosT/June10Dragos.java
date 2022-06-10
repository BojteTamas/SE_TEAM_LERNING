package DragosT;

public class June10Dragos {
// Varargs
public static void varargument1(int start, int... nums) {
    System.out.println(nums.length);
} //corect normal var and last one is varchar
public static void varargument2(int... nums1) {
    System.out.println(nums1[1]); // print nums array element of index 1
}    // correct
  //  public void varargument3(int... nums, int start) { } // does not compile vararg must be last parameter
  //   public void varargument4(int... start, int... nums) { } // does not compile vararg can be only 1 per method

public static void main(String[] args) {
    varargument2(21, 24); // 24
    varargument1(1,2); // will print 1
    varargument1(2,1,34,5); //will print 3
}

}
