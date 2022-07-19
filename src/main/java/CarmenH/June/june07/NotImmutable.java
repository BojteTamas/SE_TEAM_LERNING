package CarmenH.June.june07;
// this example could make you thing it is immutable because it doesn't have a setter
public class NotImmutable {

  private StringBuilder builder;

  public NotImmutable(StringBuilder b) {
    builder = b;
  }
  /*
  public   Mutable(StringBuilder b) {
      builder = new StringBuilder(b);
  }
  public StringBuilder getBuilder() {
      return new StringBuilder(builder);
  }

  */

  public StringBuilder getBuilder() {
    return builder;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("initial");
    NotImmutable ciuciulica = new NotImmutable(sb);
    sb.append(" added");
    StringBuilder gotBuilder = ciuciulica.getBuilder();
    gotBuilder.append(" more");

    System.out.println(
        ciuciulica
            .getBuilder()); // this outputs "initial added more" that means is not immutable, the
    // val
    // we are passing the same StringBuilder all over
    // The caller has a reference since it was passed to the constructor. Anyone who calls the
    // getter gets a reference too.
    // A solution is to make a copy of the mutable object. This is called a defensive copy.
  }
}
/* Another approach for the getter is to return an immutable object:
public String getValue() {
    return builder.toString();
}

 */
