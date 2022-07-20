package MariaD.Chapter_5.Modifiers_Constructors_Objects;

import java.util.*;

/*
a public access modifier applied to a class indicates that it can be referenced and used in any class
the default package private modifier = the lack of any access modifier,
        indicates the class can be accessed only by a subclass or class within the same package
we can define many classes within the same file
 */
class Access {
  public int access;

  public Access(int access) {
    this.access = access;
  }

  public String toString() {
    return ("acesta este" + access);
  }
}

class CLassa extends Access {
  public int access_enervant;

  public CLassa(int access, int nervi) {
    super(access);
    this.access_enervant = nervi;
  }

  public String toString() {
    return (super.toString() + " \nnumar de nervi " + access_enervant);
  }
}

public class CLass_Access {
  public static void main(String[] args) {
    CLassa clasa = new CLassa(9, 10);
    System.out.println(clasa);
    /*
    acesta este9
    numar de nervi 10
     */
  }
}
// avem mai multe clase in acelasi fisier, dar doar 1 este public class.
// daca am vrea sa facem una dintre clase public, acest lucru nu ar putea fi realizat in cadrul
// acestui fisier.
// ar trebui creat un fisier nou, cu numele clasei pe care vrem sa o definim ca si public class
