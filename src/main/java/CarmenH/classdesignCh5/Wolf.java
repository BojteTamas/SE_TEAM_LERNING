package CarmenH.classdesignCh5;

public class Wolf extends Canine {

  public double getAverageWeight() {
    return super.getAverageWeight()
        + 20; // if we would remove super - we would get an infinite loop
  }

  public static void main(String[] args) {
    System.out.println(new Canine().getAverageWeight());
    System.out.println(new Wolf().getAverageWeight());
  }
}
