package CarmenH.ExceptionsCh6;

public class CanNotHopException extends Exception {}

class Hopper {
  public void hop() {}
}

class Bunnyy extends Hopper {

  //  public void hop() throws CanNotHopException {
  //  } // DOES NOT COMPILE

  public static void main(String[] args) {}
}
// hop() in CarmenH.ExceptionsCh6.Bunnyy cannot override hop() in CarmenH.ExceptionsCh6.Hopper
//  overridden method does not throw CarmenH.ExceptionsCh6.CanNotHopException
