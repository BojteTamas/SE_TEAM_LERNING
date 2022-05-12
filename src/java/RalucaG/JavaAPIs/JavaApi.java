package JavaAPIs;

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
         * an array is an ordered list
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
    }
}