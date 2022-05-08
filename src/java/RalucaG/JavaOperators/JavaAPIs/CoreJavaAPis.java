package JavaOperators.JavaAPIs;

public class CoreJavaAPis {

    public static void main (String[]... args) throws Exception{

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        //Immutability

        class Mutable {
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


        //Important string methods
        //length()  -- returns the number of characters in the string
        String string = "animals";
        System.out.println(string.length());

        //charAt() -- lets you query the string to find out what character is at a specific index, index count starts with 0

        String sstring = "animals";
        System.out.println(sstring.charAt(0)); // a
        System.out.println(sstring.charAt(6)); //s
        System.out.println(sstring.charAt(7)); //throws exception

       //indexOf() - looks at the characters in the string and finds the first index that matches the desired value
        //it can work with an individual value or a whole string as an input,it can also start from a requested position

        //int indexOf(char ch)
        //int indexOf(char ch, index fromIndex)


        String a = "animals";
        System.out.println(a.indexOf('a')); /* 0 */
        System.out.println(a.indexOf("al")); /* 4 */
        System.out.println(a.indexOf('a' , 4)); /* 4 */
        System.out.println(a.indexOf("al", 5)); /* -1 */


        /**substring() -- looks for characters in a string.It returns part of the string. The first parameter
         * is the index to start with for the returned string. This is a zero based index.
         * There is an optional second parameter, which is the end index you want to stop at
         */

        System.out.println(a.substring(3)); /* mals */
        System.out.println(a.substring(a.indexOf('m'))); /* mals */
        System.out.println(a.substring(3 , 4)); /* m */
        System.out.println(a.substring(3 , 7)); /* mals */


        /**toLowerCase() and toUpperCase() - methods to convert data
         * String toLowerCase(String str)
         * String toUpperCase(String str)
         */

        System.out.println(a.toUpperCase()); /* ANIMALS */
        System.out.println("Abc123".toLowerCase()); /* abc123 */


    }




}
