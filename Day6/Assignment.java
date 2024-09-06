package Day6;
import java.util.*;

public class Assignment {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr1 = new int[size];
    for(int i=0;i<arr1.length;i++){
      System.out.print("Enter the element at index "+i+": ");
      arr1[i] = sc.nextInt();
    }
    System.out.println("The elements of the array are: ");
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println();

    //Find the element

    System.out.println("Enter the element to search");
    int elm = sc.nextInt();
    System.out.println("Element found at index "+findElement(arr1,elm));
    sc.close();

    //Find the largest element
    System.out.println("The largest element in the array is: "+findLargest(arr1));

    //Find the smallest element
    System.out.println("The smallest element in the array is: "+findSmallest(arr1));

    //Find the sum of the elements
    System.out.println("The sum of the elements in the array is: "+findSum(arr1));

    //Find the sum of the elements in a range
    System.out.println("The sum of the elements in the range is: "+findSumRange(arr1,2,5));

    //Find the largest element in a range
    System.out.println("The largest element in the range is: "+findLargestRange(arr1,1,5));

    //Find the smallest element in a range
    System.out.println("The smallest element in the range is: "+findSmallestRange(arr1,0,4));

    //Swap two elements in the array
    swapElements(arr1,2,0);
    System.out.println("The elements after swapping are: ");
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i]+" ");
    }

    sc.close();
  }

  //Method to find the element
  public static int findElement(int[] arr,int element){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==element){
        return i;
      }
    }
    return -1;
  }

  //Method to find the largest element
  public static int findLargest(int[] arr) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= largest) {
        largest = arr[i];
      } else {
        continue;
      }
    }
    return largest;
  }

  //Method to find the smallest element
  public static int findSmallest(int[] arr) {
    int smallest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= smallest) {
        smallest = arr[i];
      } else {
        continue;
      }
    }
    return smallest;
  }

  //Method to find the sum of the elements
  public static int findSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  //Method to find the sum of the elements in a range
  public static int findSumRange(int[] arr, int start, int end) {
    int sum = 0;
    if (start < 0 || end > arr.length) {
      return 0;
    }
    for (int i = start; i <= end; i++) {
      sum += arr[i];
    }
    return sum;
  }

  //Method to find the largest element in a range
  public static int findLargestRange(int[] arr, int start, int end) {
    int largest = arr[start];
    if (start < 0 || end > arr.length) {
      return 0;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] >= largest) {
        largest = arr[i];
      } else {
        continue;
      }
    }
    return largest;
  }

  //Method to find the smallest element in a range
  public static int findSmallestRange(int[] arr, int start, int end) {
    int smallest = arr[start];
    if (start < 0 || end > arr.length) {
      return 0;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] <= smallest) {
        smallest = arr[i];
      } else {
        continue;
      }
    }
    return smallest;
  }

  //Method to Swap two elements in a given array
  public static void swapElements(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
 
}
