package DragosT.DefaultPrivatePackageAccess;

public class UseDefaultaccess {

  public void usedefault() {
    DefaultAccess def = new DefaultAccess();
    def.tippetrecere(); // is reachable sinc it's tha same package and default access
    System.out.println(
        def.stringdefault); // is reachable sinc it's tha same package and default access
  }
}
