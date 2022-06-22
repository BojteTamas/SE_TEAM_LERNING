package CarmenH.classdesignCh5;

public interface HasFins {

  public default int getNumberOfFins() { // define a default method
    return 4;
  }

  public default double getLongestFinLength() { // define a default method
    return 20.0;
  }

  public default boolean doFinsHaveScales() { // define a default method
    return true;
  }
}
