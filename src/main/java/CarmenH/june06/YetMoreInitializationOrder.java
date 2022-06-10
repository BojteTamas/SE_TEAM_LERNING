package CarmenH.june06;

public class YetMoreInitializationOrder {
  static {
    add(2);
  } // rule 2 - static

  static void add(int num) {
    System.out.print(num + " ");
  } // this is the add method

  YetMoreInitializationOrder() {
    add(5);
  } // rule 4 - the constructor

  static {
    add(4);
  } // rule 2 - static

  {
    add(6);
  } // rule 3 Instance variable declarations and instance initializers

  static {
    new YetMoreInitializationOrder();
  } // rule 2 - static

  {
    add(8);
  } // rule 3 Instance variable declarations and instance initializers

  public static void main(String[] args) {}
}

/*
let's take the rules:
1 - superclass - I think we do not have a super class here
2 - static decl + init :
2
4
5 - wrong! this is the costructor
6
8

correct is:
2
4
6
8
5
 */
