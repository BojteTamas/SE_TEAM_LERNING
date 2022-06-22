package RalucaG.ClassDesignOCAChapter5;

public class Fox implements Herbivore, Omnivore {
  @Override
  public void eatMeat() {
    System.out.println("Foxxy is eating meat");
  }

  @Override
  public void eatPlants() {
    System.out.println("Foxxy is also eating plants");
  }

  public int eatingPlants(int quantity) {
    System.out.println("Eating plants: " + quantity);
    return quantity;
  }

  @Override
  public void eatingPlants() {
    System.out.println("Eating plants");
  }

  public static void main(String[] args) {
    Fox fox = new Fox();
    fox.eatMeat();
    fox.eatPlants();
    fox.eatingPlants();
    fox.eatingPlants(23);
  }
}
