package CalinA.OCA8.JulOCA.Arrays.CreatingArray;

class Name {
  public int number;
  public String student;

  Name(int number, String student) {
    this.number = number;
    this.student = student;
  }
}

public class Jul18CreatingArraywithReferenceVariables {
  public static void main(String[] args) {
    Name[] arr;
    arr = new Name[6];
    arr[1] = new Name(1, "Ana");
    arr[2] = new Name(2, "Flavia");
    arr[3] = new Name(3, "Ionut");
    arr[4] = new Name(4, "Florin");
    arr[5] = new Name(5, "Ariana");

    for (int x = 1; x < arr.length; x++)
      System.out.println("At line " + arr[x].number + " " + " : " + arr[x].student);
  }
}
// Read from OCA
//        Creating an Array with Reference Variables
