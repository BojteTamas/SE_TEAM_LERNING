package JavaAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaApi {
    public static void main(String[] args) throws Exception {

    int three = 3;
    String four = "4";
    System.out.println(1 + 2 + three + four);

    //Immutability

    /* class Mutable {
     private String s;
     public void setS(String newS){s = newS;}  //setter makes it mutable
     public String getS() {
     return s;}
     }

     final class Immutable {
     private String s = "name";

     public String getS() {
     return s;
     }
     }
*/

    //Important string methods
    //length()  -- returns the number of characters in the string
    //String string = "animals";
    //System.out.println(string.length());

    //charAt() -- lets you query the string to find out what character is at a specific index, index count starts with 0

    //String sstring = "animals";
   // System.out.println(sstring.charAt(0)); // a
   // System.out.println(sstring.charAt(6)); //s
   // System.out.println(sstring.charAt(7)); //throws exception

    //indexOf() - looks at the characters in the string and finds the first index that matches the desired value
    //it can work with an individual value or a whole string as an input,it can also start from a requested position

    //int indexOf(char ch)
    //int indexOf(char ch, index fromIndex)


   // String a = "animals";
    //System.out.println(a.indexOf('a')); /* 0 */
    //System.out.println(a.indexOf("al")); /* 4 */
    //System.out.println(a.indexOf('a' , 4)); /* 4 */
   // System.out.println(a.indexOf("al", 5)); /* -1 */


    /**substring() -- looks for characters in a string.It returns part of the string. The first parameter
     * is the index to start with for the returned string. This is a zero based index.
     * There is an optional second parameter, which is the end index you want to stop at
     */

    //System.out.println(a.substring(3)); /* mals */
   // System.out.println(a.substring(a.indexOf('m'))); /* mals */
   // System.out.println(a.substring(3 , 4)); /* m */
   // System.out.println(a.substring(3 , 7)); /* mals */


    /**toLowerCase() and toUpperCase() - methods to convert data
     * String toLowerCase(String str)
     * String toUpperCase(String str)
     */

   // System.out.println(a.toUpperCase()); /* ANIMALS */
  //  System.out.println("Abc123".toLowerCase()); /* abc123 */


//11 May continue Core Java API's chapter

    /** equals() and equalsIgnoreCase()
     * equals - checks whether two String objects contain exactly the same characters in the same order
     * equalsIgnore - checks whether two String objects contain exactly the same characters in the same order
     * with the exception that it will convert the charaters case if needed
     *
     */

    System.out.println("abc".equals("ABC")); // false
    System.out.println("ABC".equals("ABC")); // true
    System.out.println("abc".equalsIgnoreCase("ABC")); // true

    /** startsWith() and endsWith()
     * the methods look at whether the provided value matches part of the String
     */

    System.out.println("abc".startsWith("a")); // true
    System.out.println("abc".startsWith("A")); // false
    System.out.println("abc".endsWith("c")); // true
    System.out.println("abc".endsWith("a")); //false

    /** contains() - looks for matches in the String, the match can be anywhere in the string
     */

    System.out.println("abc".contains("b")); // true
    System.out.println("abc".contains("B")); // false

    /** replace() - does a simple search and replace on the string
    * there is a version that takes char parameters and one that takes CharSequence parameters
    * String replace (char oldChar, char newChar)
    * String replace (CharSequence, oldChar, CharSequence newChar)
    */


    System.out.println("abcabc".replace("a", "A")); // AbcAbc
    System.out.println("abcabc".replace('a', 'A')); // AbcAbc

        /**trim() removes whitespace from the beginning and end of a String
         * public String trim()
          */


    System.out.println("abc".trim()); // abc
    System.out.println("\t   a b c\n".trim()); // a b c



    String start = "AniMaL  ";
    String trimmed = start.trim();

    String lowercase = trimmed.toLowerCase();
    String result = lowercase.replace('a','A');
    System.out.println(result);

    //Using the StringBuilder Class - example without stringBuilder
        String alpha = "";
        for (char current = 'a'; current<= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        //StringBuilder example

        StringBuilder alpha1 = new StringBuilder();
        for (char current ='a'; current<= 'z'; current++){
            alpha1.append(current);
        }
        System.out.println(alpha1);

        //Mutability and Chaining

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same =sb.append(("+end"));

        System.out.println(same);

//12 May continue chapter 3 of OCA
        //Important StringBuilder Methods
        //charAt(), indexOf(), substring()

        StringBuilder sba = new StringBuilder("animals");
        String sub = sba.substring(sba.indexOf("a"),sba.indexOf("al"));
        int len = sba.length();
        char ch = sba.charAt(6);

        System.out.println(sub + " " + len + " " + ch);

    //append()

        StringBuilder swe = new StringBuilder().append(1).append('c');
        swe.append("-").append(true);

        System.out.println(swe);

    //insert()

        StringBuilder ani = new StringBuilder("animals");
        ani.insert(7, "-");
        ani.insert(0,"-");
        ani.insert(4,"-");

        System.out.println(ani);

    //delete() and deleteCharAt()

    /**    StringBuilder we = new StringBuilder("abcdef");
        we.delete(1,3);
        we.deleteCharAt(5);
    **/
    //reverse() and toString()

        StringBuilder de = new StringBuilder("ABC");
        de.reverse();

        System.out.println(de);

    //    String q = q.toString();

    //Java Arrays
        /** char [] letters; --> letters is a reference variable and not a primitive, char is a primitive
         * an array is a  n ordered list
         *int[] numbers1 = new int[3];
         *int[] numbers2 = {42,55,99};
         *int[] numAnimals;
         * int[] numAnimals2;
         * int numAnimals3[];
         * int numAnimals4[];
          */


        String[] bugs = {"cricket", "beetle","ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@9807454]

        String[] mammals ={"monkey","chimp","donkey"};
        System.out.println(mammals.length);  //3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey


        String[] birds = new String[6];
        System.out.println(birds.length);



    //16 May -- continue chapter 3 OCA- Arrays and Sorting

    String birdss[] = new String[6];
    System.out.println(birdss.length);

    int[] numbers = {6, 9, 1};
    Arrays.sort(numbers);
    for (int i = 0; i< numbers.length; i++){
        System.out.println(numbers[i] + " ");
    }

    String[] strings = {"10", "9", "100"};
    Arrays.sort(strings);
    for (String string : strings){
        System.out.println(string + " ");
    }

    //Searching
        int[] numberss = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numberss, 2)); // 0
        System.out.println(Arrays.binarySearch(numberss, 4)); // 1
        System.out.println(Arrays.binarySearch(numberss, 1)); // -1
        System.out.println(Arrays.binarySearch(numberss, 3)); // -2
        System.out.println(Arrays.binarySearch(numberss, 9)); // -5


//17 May multidimensional array
        int[][] vars1; //2D array
        int vars2[][]; //2D array
        int[] vars3[]; //2D array
        int[] vars4 [], space[][]; //a2D and a3D array

        //specify the size of your multidimensional array
        String [] [] rectangle = new String [3][2]; // result is an array rectangle with three elements each of which refers to an array of two elements

        int[][] twoD = new int[3][2];
        for (int r=0; r <twoD.length; r++){
            for (int w=0;w <twoD[r].length; w++){
                System.out.println(twoD[r][w] + " "); //print element
                System.out.println(); // time for a new row
            }
        }

        //old java way to create lists

        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>(10);
        ArrayList list3 = new ArrayList<>(list2);

        //new java way
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        list4.add("hawk");
        list4.add(String.valueOf(Boolean.TRUE));
        System.out.println(list4);

        list5.add("raven");
        list5.add(1,"robin");
        list5.add(0,"blue jay");
        list5.add(1,"cardinal");


        System.out.println(list5);

        list5.set(2,"robin");
        System.out.println(list5.remove(1));
        System.out.println(list5);

    //18 May 2022

       List<String> birdies = new ArrayList<>();
       birdies.add("blue jay");
       birdies.add("paradise bird");
       System.out.println(birdies.isEmpty()); //false
       System.out.println(birdies.size()); // 2
        birdies.clear(); // []
        System.out.println(birdies.isEmpty()); // true
        System.out.println(birdies.size()); // 0

    //wrapper classes
    //each primitive type has a wrapper class which is an object type that corresponds to the primitive
    //int primitive = Integer.parseInt("123"); converts a string to an int primitive
    //Integer wrapper = Integer.valueOf("123"); converts a string to an integer wrapper class

    //int bad1 = Integer.parseInt("a")  //throws NumberFormatException
    //Integer bad2 = Integer.valueOf("123.45") // throws NumberFormatException

    //Autoboxing - you can just type the primitive value and Java will convert it to the relevant wrapper class

    List<Double> weights = new ArrayList<>();
    weights.add(50.5);
    weights.add(new Double(60));
    weights.remove(50.5);
    double first = weights.get(0);

    System.out.println(weights);

  //Converting between array and List

      List<String> liste = new ArrayList<>();
     liste.add("hawk");
     liste.add("robin");
     Object[] objectArray = liste.toArray();
     System.out.println(objectArray.length);
    String[] stringArray = liste.toArray(new String[0]);
     System.out.println(stringArray.length);

    //Sorting

        List<Integer> numeros = new ArrayList<>();
        numeros.add(99);
        numeros.add(5);
        numeros.add(81);

        Collections.sort(numeros);
        System.out.println(numeros);


     //Working with Dates and Times
     //LocalDate : contains just a date - no time and no time zone
     //LocalTime : contains just a time - no date and no time zone
     //LocalDateTime: contains both a date and time but no time zone

     System.out.println(LocalDate.now());
     System.out.println(LocalTime.now());
     System.out.println(LocalDateTime.now());

     LocalDate date1 = LocalDate.of(1991, Month.JANUARY, 24);
     LocalDate date2 = LocalDate.of(1991,1,24);

     LocalTime time1 = LocalTime.of(21,03);
     LocalTime time2 = LocalTime.of(21, 03, 45);
     LocalTime time3 = LocalTime.of(21, 03, 45, 200);

     System.out.println(date1 + " ------ " + date2 + " -------" + time1 + " ----" + time2 + " -----" + time3);


    }
}