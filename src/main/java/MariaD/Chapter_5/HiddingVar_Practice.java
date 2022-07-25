package MariaD.Chapter_5;

import java.util.*;

class Veverita {
  public int lungime = 4;
}

public class HiddingVar_Practice extends Veverita {
  public int lungime = 8;

  public static void main(String[] args) {
    HiddingVar_Practice ex = new HiddingVar_Practice();
    Veverita veve = new HiddingVar_Practice();
    System.out.println(ex.lungime);//8
    System.out.println(veve.lungime);//4
  }
}
