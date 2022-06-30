package CalinA.OCA8.OCA06;

public class Jun30 {
  public static void main(String[] args) {
    String s = "Theforcebewithus";

    System.out.println("String length = " + s.length());
    System.out.println("Character of the 5rd position = " + s.charAt(5));
    System.out.println("Substring " + s.substring(4));
    System.out.println("Substring = " + s.substring(2, 6));

    String s1 = "Theforce";
    String s2 = "bewithus";
    System.out.println("Concatenated string = " + s1.concat(s2));

    String s3 = "It's hot outside";
    System.out.println("Index of hot " + s3.indexOf("hot"));
    System.out.println("Index of t = " + s3.indexOf('t', 2));

    Boolean out = "Theforce".equals("the force");
    System.out.println("Checking Equality " + out);
    out = "Theforce".equals("Theforce");
    System.out.println("Checking Equality " + out);

    out = "Theforce".equals("theForce");
    System.out.println("Checking Equality " + out);

    int out1 = s1.compareTo(s2);
    System.out.println("The difference value is = " + out1);

    String word1 = "SummeR";
    System.out.println("Change to Lower Case " + word1.toLowerCase());

    String word2 = "SuMmeR";
    System.out.println("Change to Upper Case " + word2.toUpperCase());

    String word3 = " It's hot outside ";
    System.out.println("Trim the word " + word3.trim());

    String str1 = "Thaforcabawithus";
    System.out.println("Original String " + str1);

    String str2 = "Thaforcabawithus".replace('a', 'e');
    System.out.println("Replaced a with e => " + str2);
  }
}

// Read from OCA
//        Important String Methods
