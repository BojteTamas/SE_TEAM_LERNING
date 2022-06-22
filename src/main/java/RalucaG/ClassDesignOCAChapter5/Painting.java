package RalucaG.ClassDesignOCAChapter5;

public interface Painting {
  void draw();

  default void text() {
    System.out.println("Default method body in interface Painting");
  }
}
