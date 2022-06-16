package RalucaG.ClassDesignOCAChapter5;

public class ClassChild extends ClassParent {
  ClassChild(int ageix) {
    super(ageix);
  }

  public static void main(String[] args) {
    ClassChild object = new ClassChild(31);
    object.getAge();
  }
}
