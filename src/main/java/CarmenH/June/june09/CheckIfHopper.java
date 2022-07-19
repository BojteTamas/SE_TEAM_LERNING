package CarmenH.June.june09;
/** this is from yesterday */
import CarmenH.June.june08.Animal;
import CarmenH.June.june08.CheckTrait;

public class CheckIfHopper implements CheckTrait {
  public boolean test(Animal a) {
    return a.canHop();
  }
}
