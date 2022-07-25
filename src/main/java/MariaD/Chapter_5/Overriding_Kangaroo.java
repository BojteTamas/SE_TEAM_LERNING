package MariaD.Chapter_5;

import java.util.*;

class Marsupial {
  public boolean isBiped() {
    return false;
  }

  public void getMarsupialDescr() {
    System.out.println("marsupial walks on 2 legs " + isBiped());
  }
}

public class Overriding_Kangaroo extends Marsupial {
  public boolean isBiped() {
    return true;
  }

  public void getKangarooDescr() {
    System.out.println("kagaroo jumps on 2 legs " + isBiped());
  }

  public static void main(String[] args) {
    Overriding_Kangaroo joe = new Overriding_Kangaroo();
    joe.getKangarooDescr(); // kagaroo jumps on 2 legs true
    joe.getMarsupialDescr(); // marsupial walks on 2 legs true
  }
}
