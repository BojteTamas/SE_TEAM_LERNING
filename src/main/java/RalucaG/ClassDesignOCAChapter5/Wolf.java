package RalucaG.ClassDesignOCAChapter5;

public class Wolf extends Dogs {
  @Override
  public double getAverageWeight() {
    return super.getAverageWeight() + 20;
  }

  public static void main(String[] args) {
    System.out.println(new Dogs().getAverageWeight());
    System.out.println(new Wolf().getAverageWeight());
  }
}
