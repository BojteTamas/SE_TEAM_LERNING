package CarmenH.may.may31;

import java.util.ArrayList;

public class Initializers {
    private static int one;
    private static final int two;
    private static final int three=3;
    //private static final int four; //this is never initialized
    static {
        one = 1;
        two = 2;
        //three = 3; //cannot assign second time a value to a final variable
        //two = 4; //cannot assign second time a value to a final variable
    }

    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
      //  NUM_BUCKETS = 5; // DOES NOT COMPILE
        values.add("changed");


    }
    private static final ArrayList<String> values = new ArrayList<>();//It actually does compile. values is a reference variable.
//We are allowed to call methods on reference variables. All the compiler can do is check that we don’t try to reassign the final values to point to a different object.
}

   // The compiler will make sure that you do not accidentally try to update a final variable.