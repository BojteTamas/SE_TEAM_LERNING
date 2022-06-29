package DragosT;

public class FinalFieldsConstructor {
  private final int volume;
  public final String name = "Final Fields Constructor";

  public FinalFieldsConstructor(int length, int width, int height) {
    volume = length * width * height;
  }

  public static void main(String[] args) {
    FinalFieldsConstructor var = new FinalFieldsConstructor(121, 231, 321);
    System.out.println(var.volume);
    System.out.println(var.name);
  }
}
