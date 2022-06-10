package MariaD.june_10;

import java.util.ArrayList;

public class Array_list {
  public static void main(String[] args) {
    ArrayList prajitura = new ArrayList<>();
    prajitura.add("oua");
    prajitura.add(1, "zahar");
    prajitura.add(0, "mascarpone");
    prajitura.add(1, "piscoturi");
    System.out.println(prajitura); // /[mascarpone, piscoturi, oua, zahar]
  }
}
