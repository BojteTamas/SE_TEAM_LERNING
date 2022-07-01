package MariaD.may_june.june_30.june_22;

/*
public: The public access modifier is specified using the keyword public.
The public access modifier has the widest scope among all other access modifiers.
Classes, methods, or data members that are declared as public are accessible from everywhere in the program.
There is no restriction on the scope of public data members.
 */

// Class public
// public modifier
public class Public {
  public void display() {
    System.out.println("PUBLIC CLASS, E CIUDAT");
  }
}
// Class B is subclass of A
class B extends Public {
  public static void main(String args[]) {
    B obj = new B();
    obj.display();
  }
}
