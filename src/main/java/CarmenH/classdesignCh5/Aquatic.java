package CarmenH.classdesignCh5;

interface Aquatic {
  public default int getNumberOfGills(int input) {
    return 2;
  }
}
