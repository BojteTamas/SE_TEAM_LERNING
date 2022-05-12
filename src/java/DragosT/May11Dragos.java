public class May11Dragos {

//StringBuilder Methods
    //charAt(), indexOf(), length(), and substring()
public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("animals");
    String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));//from a to al -> anim
    int len = sb.length();//7
    char ch = sb.charAt(6);//s
    System.out.println(sub + " " + len + " " + ch); //anim 7 s

}
}