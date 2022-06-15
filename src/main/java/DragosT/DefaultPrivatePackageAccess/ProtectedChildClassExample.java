package DragosT.DefaultPrivatePackageAccess;

import DragosT.AccessModifiers.ProtectedBaseClassExample;

public class ProtectedChildClassExample extends ProtectedBaseClassExample {
  public void protectedExtended() {
    tippetrecere(); // can be accessed from another package
    System.out.println(stringProtected); // can be accessed from another package
  }
}
