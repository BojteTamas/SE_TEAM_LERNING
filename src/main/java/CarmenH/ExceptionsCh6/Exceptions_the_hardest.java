package CarmenH.ExceptionsCh6;

public class Exceptions_the_hardest {
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            }   catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
        }
    public static void main(String... args) {
        Exceptions_the_hardest result=new Exceptions_the_hardest();
        System.out.println(result.exceptions()); //beforecatchfinallydone
    }
}

