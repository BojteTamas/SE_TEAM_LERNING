package CarmenH.classdesignCh5;

public abstract class Whale2 {
  public abstract void dive(); // removed {}

  public static void main(String[] args) {
    Whale2 whale =
        new Orca() {
          @Override
          public void dive() {}
        };
    whale.dive();
  }
}
