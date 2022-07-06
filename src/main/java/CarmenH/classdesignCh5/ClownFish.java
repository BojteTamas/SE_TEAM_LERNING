package CarmenH.classdesignCh5;

public class ClownFish implements Aquatic {

  public String getNumberOfGills() {
    return "4";
  }

  public int getNumberOfGills(int input) { // it was returning String
    return 6; // "6"
  }

  public static void main(String[] args) {

    System.out.println(new ClownFish().getNumberOfGills(-1));
  }
}
