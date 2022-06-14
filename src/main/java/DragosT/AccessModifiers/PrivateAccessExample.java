package DragosT.AccessModifiers;

public class PrivateAccessExample {
  // Apply access modifiers
  //    private: Only accessible within the same class
  //    default (package private) access: private and other classes in the same package
  //    protected: default access and child classes
  //    public: protected and classes in the other packages
  // private

  private String stringprivat = "Privat";

  private void tippetrecere() {
    System.out.println(stringprivat);
  }

  private void decarepetrecere() {
    tippetrecere();
  }
  // toate sunt ok private pt ca sunt in aceeasi clasa
}
