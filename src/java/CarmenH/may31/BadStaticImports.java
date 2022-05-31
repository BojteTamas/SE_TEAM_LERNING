package CarmenH.may31;
//import static java.util.Arrays;
import java.util.Arrays;
import static java.util.Arrays.asList;
//static import java.util.Arrays.*;


public class BadStaticImports {

    public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE //import java.util.Arrays;
    }
}

//Line 2 tries to use a static import to import a class. Remember that static imports are only for importing static members.Regular imports are for importing a class
//Line 4 tries to see if you are paying attention to the order of keywords. The syntax is import static and not vice versa.
//Line 10 is sneaky. We imported the asList method on line 3. However, we did not import the Arrays class anywhere. This makes it okay to write asList("one"); but not Arrays.asList("one");.