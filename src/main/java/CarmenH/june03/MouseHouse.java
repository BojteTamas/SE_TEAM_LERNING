package CarmenH.june03;

public class MouseHouse {

  private final int volume;

  private final String name = "The Mouse House";

  public MouseHouse(int length, int width, int height) {
    volume = length * width * height;
    System.out.println(volume);
  }

  public static void main(String[] args) {
    MouseHouse casuta_soricelului = new MouseHouse(2, 6, 4);
  }

  // yey, managed to use the contractors and actually see the assigned value
}
