package CalinA.OCA8.JulOCA.Deletechartat;

public class Jul11deletecharat2 {
  public static void main(String[] args) {
    StringBuilder delc = new StringBuilder("Summer is fun");
    System.out.println("Before removing character: " + delc.toString());
    delc = delc.deleteCharAt(3);
    System.out.println("After removal character" + " from index 3: " + delc.toString());
    delc = delc.deleteCharAt(8);
    System.out.println("After removal character" + " from index 8: " + delc.toString());
  }
}
