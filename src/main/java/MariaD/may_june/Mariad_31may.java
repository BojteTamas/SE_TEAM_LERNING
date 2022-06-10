package MariaD.may_june;

// length() method returns the no. of characters in the String
// ATTENTION --!!!JAVA USES NORMAL COUNTING WHEN DETERMINNING THE TOTAL SIZE/ LENGTH (DOESN'T START
// FROM 0)
/*public class Mariad_31may {
public static void main(String[] args) {
    String string = "mancarica";//output 9
    System.out.println(string.length());
*/

// charAt() method --lets you query the string to fing our what characted is it a specific index
// ATTENTION !!! indexes start counting from 0
/*public class Mariad_31may {
public static void main(String[] args) {
    String string = "animals";
    //System.out.println(string.charAt(0));// output a
    //System.out.println(string.charAt(6)); //output s
    //System.out.println(string.charAt(7)); //exception thread

 */

// indexOf() find the first index that matches to the desired value
// works as an individual character or a whole value String
// can start from a requested position
// !!!indexes begin with 0 (same as charAt , but it doesn't throw exception when it doesn't find a
// characted)
/*
   public class Mariad_31may {
   public static void main(String[] args) {
       String string = "animals";
       //System.out.println(string.indexOf('a'));//0
       //System.out.println(string.indexOf("al")); //output 4 looks for a specific string
       //System.out.println(string.indexOf('a',4));//output 4 looks until it gets to index 4
       System.out.println(string.indexOf("al",6));//-1
*/
// substring() method
// looks for characters in a string
// returns part of string
// !!!indexes begin with 0
// beginIndex endIndex

public class Mariad_31may {
  public static void main(String[] args) {
    String string = "computer";
    // System.out.println(string.substring(3));//output puter// take the characters starting with
    // index 3
    // System.out.println(string.substring(string.indexOf('m')));//mputer cals indexOf() to get the
    // index
    // System.out.println(string.substring(3,5));//pu-- starts with 3, and it stops at index 4
    System.out.println(
        string.substring(
            2, 6)); // mpu --take the characters starting from index 2, up until index 6
  }
}
