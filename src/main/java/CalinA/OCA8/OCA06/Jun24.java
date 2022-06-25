package CalinA.OCA8.OCA06;

public class Jun24 {
  public static void main(String[] args) {
    for (int x = 1; x <= 4; x++) {
      for (int y = 1; y <= 3; y++) {
        if (x == 3 && y == 2) {
          continue;
        }
        System.out.println(x + " numara " + y);
      }
    }
  }
}
// Read from OCA
//        The continue Statement
