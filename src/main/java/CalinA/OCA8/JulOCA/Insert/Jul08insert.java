package CalinA.OCA8.JulOCA.Insert;

public class Jul08insert {
  public static void main(String[] args) {
    StringBuilder ins = new StringBuilder("Today is Friday. ");
    System.out.println("Before insert: " + ins);
    ins.insert(17, true);
    System.out.println("After insert: " + ins);

    StringBuilder ins1 = new StringBuilder("Today is Saturday. ");
    System.out.println("Before insert: " + ins1);
    ins1.insert(ins1.length(), false);
    System.out.println("After insert: " + ins1);
  }
}
// Read from OCA
// Insert()
