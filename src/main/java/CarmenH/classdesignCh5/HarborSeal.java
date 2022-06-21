package CarmenH.classdesignCh5;

public class HarborSeal implements HasTail, HasWhiskers {
  @Override
  public int getTailLength() {
    return 0;
  }

  @Override
  public int getNumberOfWhiskers() {
    return 0;
  }
  /** added what is needed, the implementation for all methods in the parent interfaces */
}
