package CalinA.OCA8.JulOCA;

public class Jul05 {
  public static void main(String[] args) {
    StringBuilder str1 = new StringBuilder("OCAGoal");
    StringBuilder str2 = new StringBuilder("Learning");

    System.out.println("Str1 before change: " + str1);
    System.out.println("Str2 before change: " + str2);

    str1.append(" is to learn.");
    str2.append(" helps to improve your skills.");

    System.out.println("Str1 after change: " + str1);
    System.out.println("Str2 after change: " + str2);
  }
}

// Read from OCA:
//        Mutability and Chaining
