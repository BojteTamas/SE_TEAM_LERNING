package MariaD.june_28;

import java.util.*;

public class Method {
  public static void speak(String nume) {
    nume = "Vlad";
  }

  public static void main(String[] args) {
    String nume = "mARIA";
    speak(nume);
    System.out.println(nume); // /maria
  }
}
