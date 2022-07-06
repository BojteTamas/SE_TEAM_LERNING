package CarmenH.classdesignCh5;

abstract class Reptile3 {
  public final void layEggs() {
    System.out.println("Reptile laying eggs");
  }

  public static void main(String[] args) {
    Reptile3 reptile = new Lizard();
    reptile.layEggs();
  }
}
