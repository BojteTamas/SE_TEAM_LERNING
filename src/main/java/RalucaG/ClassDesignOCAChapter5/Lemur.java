package RalucaG.ClassDesignOCAChapter5;

public class Lemur extends Madagascar {
  public static boolean isBiped() {
    return true;
  }

  public void getLemurAnimals() {
    System.out.println(
        "Lemurs are one of the most threatened animals in the whole planet and according to IUCN Red List of Threatened Species, 22 species of lemurs are critically endangered, 48 are endangered, while 20 are vulnerable.\n"
            + "\n"
            + "it is rumored that the lemurs are biped sometimes which is "
            + isBiped()
            + "  because they hop from tree to tree");
  }

  public static void main(String[] args) {
    Lemur KingJulien = new Lemur();
    KingJulien.getMadagascarAnimals();
    KingJulien.getLemurAnimals();
  }
}
