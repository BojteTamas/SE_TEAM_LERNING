package RalucaG.RecapOCAChapters;

import java.util.Arrays;
import java.util.Collections;

public class SortingArraysExamples {
  public static void main(String[] args) {
    int[] sir = new int[] {245, 90, 32, 22, 67, 12, 45};
    Integer[] array = {245, 90, 32, 22, 67, 12, 45};
    Arrays.sort(sir);
    System.out.println("Array sorted ascend order:  ");
    for (int i = 0; i < sir.length; i++) {
      System.out.println(sir[i]);
    }
    System.out.println(
        Arrays.toString(sir)); // another method to list the array, returns string of array
    // Sorts IntArray in descending order
    Arrays.sort(array, Collections.reverseOrder());
    System.out.println("Sorts array in desc order + listing:  " + Arrays.toString(array));
    String words_array[] = {
      "Boy", "Girl", "String", "Listing", "Wonder", "Rebel", "Array", "Miracle", "Reversed"
    };
    System.out.println("Original form of the array: " + Arrays.toString(words_array));
    // sort array in ascend order
    Arrays.sort(words_array);
    System.out.println("Array sorted ascending: " + Arrays.toString(words_array));
    // sort array in descend order
    Arrays.sort(words_array, Collections.reverseOrder());
    System.out.println("Array sorted descending: " + Arrays.toString(words_array));
    // sort a subarray
    int[] arrayss = {12, 24, 35, 28, 91, 92, 05, 9, 1};
    // sort subarray index from 2 to 6
    Arrays.sort(arrayss, 2, 6);
    // list array via for
    for (int j = 0; j < arrayss.length; j++) {
      System.out.println("Array : " + arrayss[j]);
    }
    // searching examples
    int numbers[] = {2, 4, 6, 8, 12, 35};
    System.out.println("Search ex 1: " + Arrays.binarySearch(numbers, 2));
    System.out.println("Search ex 2: " + Arrays.binarySearch(numbers, 4));
    // multidimensional arrays
    int[][] arrayys = {{24, 91}, {5, 92}};
    for (int k = 0; k < 2; k++) {
      for (int r = 0; r < 2; r++) {
        System.out.println("arrayys[" + k + "][" + r + "] = " + arrayys[k][r]);
      }
    }
  }
}
