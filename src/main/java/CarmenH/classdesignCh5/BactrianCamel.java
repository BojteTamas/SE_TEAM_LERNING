package CarmenH.classdesignCh5;

public class BactrianCamel extends Camel {

  private int getNumberOfHumps() {
    // this is a new independent method from the one in the parent class
    // that one is not visible so we are allowed to create a new one with the same signature
    // the one in parent class returns String, this one returns int
    return 2;
  }
}
