package DragosT.DefaultPrivatePackageAccess;

public class DefaultAccess {
  String stringdefault = "Default";
  // will be vivible from the same package
  void tippetrecere() {
    System.out.println(stringdefault);
  }

  void decarepetrecere() {
    tippetrecere();
  }
}
