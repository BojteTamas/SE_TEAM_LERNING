package MariaD.may_june.june_30.june_28;

public class Exemplu {
  public static int count;

  public static void addExemplu() {
    count++;
  }

  public void MiniExemplu() {
    count++;
  }

  public void verificaExemple() {
    addExemplu();
    MiniExemplu();
  }

  public static void anuntaExemplu() {
    addExemplu();
    // MiniExemplu();//non-static method MiniExemplu() cannot be referenced from a static context
  }

  public static void main(String[] args) {
    addExemplu();
    // MiniExemplu();//non-static method MiniExemplu() cannot be referenced from a static context
    // verificaExemple();//non-static method MiniExemplu() cannot be referenced from a static
    // context
    anuntaExemplu();

    // asa merge
    Exemplu ex = new Exemplu();
    ex.MiniExemplu();
    ex.verificaExemple();
  }
}
