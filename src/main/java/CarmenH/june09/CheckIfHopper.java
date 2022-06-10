package CarmenH.june09;
/** this is from yesterday */
import CarmenH.june08.Animal;
import CarmenH.june08.CheckTrait;

public class CheckIfHopper implements CheckTrait {
  public boolean test(Animal a) {
    return a.canHop();
  }
}
