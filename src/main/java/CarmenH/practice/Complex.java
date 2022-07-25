package CarmenH.practice;

public class Complex {

  double real_part;
  double imaginary_part;

  public Complex(double real_part, double imaginary_part) {
    this.real_part = real_part;
    this.imaginary_part = imaginary_part;
  }

  public static void main(String[] args) {
    Complex n1 = new Complex(2.3, 4.5), n2 = new Complex(3.4, 5.0), temp;

    temp = add(n1, n2);

    System.out.printf("Sum = %.1f + %.1fi", temp.real_part, temp.imaginary_part);
  }

  public static Complex add(Complex n1, Complex n2) {
    Complex temp = new Complex(0.0, 0.0);

    temp.real_part = n1.real_part + n2.real_part;
    temp.imaginary_part = n1.imaginary_part + n2.imaginary_part;

    return (temp);
  }
}
