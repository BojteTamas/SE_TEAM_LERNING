package RalucaG.MethodsAndEncapsulation;

import static RalucaG.MethodsAndEncapsulation.CatsSearch.print;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {

  public static void main(String[] args) {
    List<Cats> cats = new ArrayList<Cats>();
    cats.add(new Cats("Main Coon", true, false));

    print(cats, c -> c.isHouseCat());
  }

  /**
   * private static void print(List<RalucaG.MethodsAndEncapsulation.Cats> cats,
   * Predicate<RalucaG.MethodsAndEncapsulation.Cats>
   * RalucaG.MethodsAndEncapsulation.Cats.checkIfHouse){ for (RalucaG.MethodsAndEncapsulation.Cats
   * cat : cats){ if RalucaG.MethodsAndEncapsulation.Cats.checkIfHouse. } }
   */
}
