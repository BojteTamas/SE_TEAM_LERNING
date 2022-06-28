package RalucaG.RecapOCAChapters;

public class Operators {
  public static void main(String[] args) {
    // ternary operators: condition ? if true : if false : if the condition is true then execute the
    // statements after the '?' else execute the statements after the ':'
    int a = 24, b = 28, c = 8, result;
    result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
    System.out.println("The maximum of three numbers is: " + result);
    // unary operators
    int x = 10;
    System.out.println("Unary operators: ");
    System.out.println(x++); // 10
    System.out.println(++x); // 12
    System.out.println(x--); // 12
    System.out.println(--x); // 10
    // arithmetic operator
    int z = 10, y = 10, w = 8;
    System.out.println("Arithmetic operators: ");
    System.out.println(x++ + ++x); // 10 + 12=22
    System.out.println(y++ + y++); // 10 + 11=21
    System.out.println(z + y + w); // 30
    System.out.println(z - y - w); // -10
    System.out.println(z * y * w); // 960
    System.out.println(z / y / w); // 0
    System.out.println(z % y % w); // 2
    // relational operators:
    System.out.println("Relational operatos:");
    System.out.println(x < y);
    System.out.println(x <= y);
    System.out.println(x >= z);
    System.out.println(x > z);
    // Logical operatos
    System.out.println("Logical operators: ");
    int r = 8;
    boolean xx = (r >= 6) || (++r <= 7);
    System.out.println(r);

    // arithmetic operator + left shift operator(used to shfit all of the bits in a value to the
    // left side of the specified number of times)
    System.out.println("Arithmetic: " + (x * z / y + w - a * b / c));
    System.out.println("Left shift: " + (a << b));
    System.out.println("Left shift_2: " + (20 << 2));
    // right shift operator: used to move the value of the left operand to right by the number of
    // bits specified by the right operand
    System.out.println("Right shift : " + (a >> b));
    System.out.println("Right shift_2: " + (20 >> 2));
    /**
     * instanceof operator: The instance of the operator is used for type checking. It can be used
     * to test if an object is an instance of a class, a subclass, or an interface. General format:
     * object instance of class/subclass/interface
     */
    // person -> boy -> interface
    Person obj1 = new Person(); // object of type person and it can't access Boy and Interface
    Person obj2 =
        new Boy(); // obj of type boy, child class of parent Person that implements interface
    System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
    System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
    System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
    System.out.println("obj2 instanceof Boy: " + (obj2 instanceof Boy));
    System.out.println("obj2 instanceof Person: " + (obj2 instanceof Person));
    System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
  }
}
