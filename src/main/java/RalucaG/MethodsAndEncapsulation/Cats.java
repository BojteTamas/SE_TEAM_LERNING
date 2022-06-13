package RalucaG.MethodsAndEncapsulation;

// starting to create a Lambda example based on OCa
public class Cats {

  private String species;
  private boolean houseCat;
  private boolean wildCat;

  public Cats(String speciesName, boolean house, boolean wild) {
    species = speciesName;
    houseCat = house;
    wildCat = wild;
  }

  public boolean isHouseCat() {
    return houseCat;
  }

  public boolean iswildCat() {
    return wildCat;
  }

  public String toString() {
    return species;
  }

  public interface CheckType {
    boolean types(Cats c);
  }

  /**
   * public static class CheckIfHouse implements CheckType{ public boolean
   * types(RalucaG.MethodsAndEncapsulation.Cats c){ return c.isHouseCat(); } }
   *
   * <p>public class CheckIfWildimplements implements CheckType{ public boolean types
   * (RalucaG.MethodsAndEncapsulation.Cats c){ return c.iswildCat(); }
   *
   * <p>} /* *
   *
   * @param args
   */
}

// needs some more work done because I can't figure out what's going on here.
