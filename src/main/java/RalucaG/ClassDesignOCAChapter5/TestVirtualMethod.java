package RalucaG.ClassDesignOCAChapter5;

public class TestVirtualMethod {
  public static void main(String[] args) {
    ItsAParentClass itsAParentClass = new ItsAChildClass();
    itsAParentClass.displayInfo();
  }
}
