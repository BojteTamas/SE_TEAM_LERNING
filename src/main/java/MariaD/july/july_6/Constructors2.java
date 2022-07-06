package MariaD.july.july_6;

class Student {
  private String nume;
  public int note;

  // folosim un constructor fara parametru
  public Student() {
    nume = "X";
    note = 6;
  }
  // constructor cu 2 parametrii
  public Student(String n, int nota) {
    nume = n;
    nota = note;
  }
  // constructor cu un singur parammetru
  public Student(String n) {
    this(n, 6); // apelam si al doilea constructor
  }

  public void apelare() {
    System.out.print(nume);
    System.out.println(note);
  }
}

public class Constructors2 {
  public static void main(String[] args) {
    Student s = new Student();
    Student s1 = new Student("Ionel", 10);
    Student s2 = new Student("Ionel");
    s.apelare();
    s1.apelare();
    s2.apelare();
  }
}
