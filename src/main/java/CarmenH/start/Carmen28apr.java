package CarmenH.start;

public class Carmen28apr {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("animals");
    String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
    int len = sb.length();
    char ch = sb.charAt(6);
    System.out.println(sub + " " + len + " " + ch);

    StringBuilder sbb = new StringBuilder().append(1).append('c');
    sbb.append("-").append(true);
    System.out.println(sbb);

    StringBuilder ssbb = new StringBuilder("animals");
    ssbb.insert(7, "-");
    ssbb.insert(0, "-");
    ssbb.insert(4, "-");
    System.out.println(ssbb);

    StringBuilder sba = new StringBuilder("abcdef");
    sba.delete(1, 3); // sb = adef
    // sba.deleteCharAt(5); // throws an exception
    System.out.println(sba);

    String x = "Hello World";
    String y = "Hello World";
    System.out.println(x == y); // true

    String xx = "Hello World";
    String z = " Hello World".trim();
    System.out.println(xx == z); // false

    StringBuilder one = new StringBuilder();
    StringBuilder two = new StringBuilder();
    StringBuilder three = one.append("a");
    System.out.println(one == two); // false
    System.out.println(one == three); // true

    String as = new String("Hello World");
    String ab = "Hello World";
    System.out.println(as == ab); // false
  }
}
