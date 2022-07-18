package MariaD.Chapter_5.Class_inheritance;

import java.io.*;
import java.util.*;

class Prima {
  public void sub_class() {
    System.out.println("aceasta e parent class");
  }
}

class Doi extends Prima {
  public void print_for() {
    System.out.println("aceasta e sub class");
  }
}

public class Single_Inheritance {
  public static void main(String[] args) {
    Doi doi = new Doi();
    doi.sub_class(); // aceasta e parent class
    doi.print_for(); // aceasta e sub class
  }
}
