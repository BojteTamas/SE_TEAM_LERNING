package MariaD.june_29;

import java.util.*;

/*
nume e o copie a variabilelei, si nu este reassignat unuil altui obiect
ambele metodele apeleaza stringbuilder
de accea schimbarile aduse in stringbuilder sunt disponibile pt ambele referinte
 */
public class Pass_stringuilder {
  public static void incercare(StringBuilder valoare) {
    valoare.append("Maria");
  }

  public static void main(String[] args) {
    StringBuilder nume = new StringBuilder();
    nume.append("Ionel");
    incercare(nume);
    System.out.println(nume); // /IonelMaria
  }
}
