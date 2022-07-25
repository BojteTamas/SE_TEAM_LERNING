package MariaD.Chapter_5;

import java.util.*;

class Rozatoare {
  protected int lungime = 4;

  public void DetaliiRozatoare() {
    System.out.println("[talieRozatoare=" + lungime + "]");
  }
}

public class HiddingVariable_Mouse extends Rozatoare {
  protected int lungime = 8;

  public void DetaliiMouse() {
    System.out.println("[talieSoricel = " + lungime + ",talieRozatoare=" + super.lungime + "]");
  }

  public static void main(String[] args) {
    HiddingVariable_Mouse rozy = new HiddingVariable_Mouse();
    rozy.DetaliiRozatoare(); // [talieRozatoare=4]
    rozy.DetaliiMouse(); // [talieSoricel = 8,talieRozatoare=4]
  }
}
