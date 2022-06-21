package DragosT;

import static java.util.Arrays.asList; // this is a static import

import java.util.List;

// imports that do not compile below
// import static java.util.Arrays;   tries to use a static import to import a class
// static import java.util.Arrays.*; bad order import static will work

public class StaticImports {
  // Static imports are for importing static members of classes.
  public static void main(String[] args) {
    List<String> list = asList("string1", "string2");
    System.out.println(list);
    // Arrays.asList("not working"); will not work because we did not import the class Arrays
    // anywhere
  }
}
