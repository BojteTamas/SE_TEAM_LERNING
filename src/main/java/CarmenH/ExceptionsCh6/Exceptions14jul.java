package CarmenH.ExceptionsCh6;

public class Exceptions14jul {

  class CanNotHopException extends Exception {}

  class Hopper {
    // public void hop() throws Exception { }
    public void hop() {}
  }

  class Bunny extends Hopper {
    // public void hop() throws CanNotHopException { }
    public void hop() throws IllegalStateException {}
    // The reason that it’s okay to declare new runtime exceptions in a subclass method is that the
    // declaration is redundant.
    // Methods are free to throw any runtime exceptions they want without mentioning them in the
    // method declaration.
  }

  public static void main(String[] args) {}
}
