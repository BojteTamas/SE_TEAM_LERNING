package MariaD.june_27;

import java.util.*;

public class User_defined_method { // metodele sunt definite in cadrul unei clase
  public void add() { // //numele metodei,
    System.out.println("Addition method");
  }

  public static void main(String[] args) {
    User_defined_method maria = new User_defined_method(); // /maria este obiectul clasei
    maria.add();
  }
}
