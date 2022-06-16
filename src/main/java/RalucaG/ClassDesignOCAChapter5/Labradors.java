package RalucaG.ClassDesignOCAChapter5;

public class Labradors extends Dogs {
  public static void main(String[] args) {
    AnimalPlanet animalPlanet = new AnimalPlanet();
    Cats cats = new Cats();
    Reptiles reptiles = new Reptiles();
    Labradors labradors = new Labradors();
    System.out.println(animalPlanet instanceof AnimalPlanet);
    System.out.println(cats instanceof AnimalPlanet);
    System.out.println(reptiles instanceof AnimalPlanet);
    System.out.println(labradors instanceof AnimalPlanet);
    System.out.println(labradors instanceof Dogs);
  }
}
