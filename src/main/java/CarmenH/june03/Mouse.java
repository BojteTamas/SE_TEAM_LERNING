package CarmenH.june03;

public class Mouse {

  private int numTeeth;
  private int numWhiskers;
  private int weight;

  public Mouse(int weight) {
    this(weight, 16); // calls the constructor with 2 parameters
  }

  public Mouse(int weight, int numTeeth) {
    this(weight, numTeeth, 6); // calls constructor with 3 parameters
  }

  public Mouse(int weight, int numTeeth, int numWhiskers) {
    this.weight = weight;
    this.numTeeth = numTeeth;
    this.numWhiskers = numWhiskers;
  }
  // interesting how the constructors are chained one with another and reducing the parameters list
  // - opposite than at the overloading methods where we add more parameters
  public void print() {
    System.out.println(weight + " " + numTeeth + " " + numWhiskers);
  }

  public static void main(String[] args) {
    Mouse mouse = new Mouse(15);
    mouse.print();
  }
}
