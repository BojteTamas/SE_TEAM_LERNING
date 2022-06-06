package CarmenH.june06;

public class InitializationOrderSimple {

    private String name = "Torchie";  // rule 3  - run the instance variable declarations and instance initializers

    { System.out.println(name); } // rule 3  - run the instance variable declarations and instance initializers

    private static int COUNT = 0;

    static { System.out.println(COUNT); }  // from rule 2 - run the static variable declarations and static initializers

    static { COUNT += 10; System.out.println(COUNT); }  // from rule 2  - run the static variable declarations and static initializers

    public InitializationOrderSimple() {
        System.out.println("constructor");
    } // rule 4 - run the constructor

   // public static void main(String[] args) {    }

}
// Rule 1 doesn't apply because there is no superclass

// Rule 2 says to run the static variable declarations and static initializers — which output 0 and 10.

// Rule 3 says to run the instance variable declarations and instance initializers —  which output Torchie.

// rule 4 says to run the constructor — which output constructor.