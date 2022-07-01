package MariaD.may_june.june_8;

import java.util.Scanner;

/*public class Array {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //String[] cars;
      // String[] cars = {"Mazda", "Opel", "Volvo", "Mercedes"};
      // cars[0] = "BMW";
       // System.out.println(cars[0]);//volvo
       //System.out.println(my_num[4]);//70 //starts counting from 0
*/
/*  public class Array {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] my_num = {10, 20, 30, 50, 70};
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9, 10};//declaring array literal
        for (int i = 0; i < intArray.length; i++)//// // accessing the elements of the specified array
            System.out.println("Element at index" + i + " : "+ intArray[i]);
        }
}
        /*output :Element at index0 : 1 => element at index + index no + : + no from array
Element at index1 : 2
Element at index2 : 3
Element at index3 : 4
Element at index4 : 5
Element at index5 : 6
Element at index6 : 7
Element at index7 : 8
Element at index8 : 9
Element at index9 : 10
   */
/*  public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr; //declares as array of integers
        arr = new int [5]; //allocates memory for 5 integers
        arr[0] = 17; //initialize the 1st element of the array
        arr[1] = 30; //2nd element of the array
        arr[2] = 35;
        arr[3] = 40;
        arr[4] = 50;
        //arr[5] = 60;
        for (int i = 0; i < arr.length; i++)
            System.out.println("element of index" + i + "+" + arr[i]);

    }
}
   */
public class Array {
  public int roll_no;
  public String name;

  Array(int roll_no, String name) {
    this.roll_no = roll_no;
    this.name = name;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Array[] arr;
    arr = new Array[5];
    arr[0] = new Array(1, "maria");
    arr[1] = new Array(2, "vlad");
    arr[2] = new Array(3, "oana");
    arr[3] = new Array(4, "dani");
    arr[4] = new Array(5, "irina");
    for (int i = 0; i < arr.length; i++)
      System.out.println("Element at" + i + ":" + arr[i].roll_no + arr[i].name);
  }
}
/*
output:
:1maria
Element at1:2vlad
Element at2:3oana
Element at3:4dani
Element at4:5irina
 */
