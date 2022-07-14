package RalucaG.RecapOCAChapters;

public class CatCodeGym {
  String name;
  int age;
  String species;

  public CatCodeGym(String name, int age, String species) {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  public CatCodeGym(String name) {
    this.name = name;
  }

  public void printCatCodeGym() {
    System.out.println(
        "The cat is called "
            + this.name
            + " , she is "
            + this.age
            + " years old. She is from the following species: "
            + this.species);
  }

  public static void main(String[] args) {
    CatCodeGym miti = new CatCodeGym("Jinxy", 2, "Gunoiera");
    miti.printCatCodeGym();
    CatCodeGym fancy = new CatCodeGym("Noele", 1, "British short-hair");
    fancy.printCatCodeGym();
  }
}
