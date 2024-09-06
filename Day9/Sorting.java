package Day9;

import java.util.*;
public class Sorting {
  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void swap(int[] a, int start, int end) {
    int x = start, y = end;
    while (x < y) {
      int temp = a[x];
      a[x] = a[y];
      a[y] = temp;
      x++;
      y--;
    }
  }

  public static void bubbleSort(int[] arr){
    for(int turn=1;turn<arr.length;turn++){
      for(int i=0;i<arr.length-turn;i++ ){
        if(arr[i]>arr[i+1]){
          swap(arr,i,i+1);
        }
      }
    }
  }

  public static int minIdx(int[] arr,int i){
    int minIndex = i;
    for(int j=i+1;j<arr.length;j++){
      if(arr[j]<arr[minIndex]){
        minIndex = j;
      }
    }
    return minIndex;
  }

  public static void selectionSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      int idx = minIdx(arr, i);
      swap(arr, i, idx);
    }
  }

  public static void insertionSort(int[] arr){
    int n = arr.length;
    for(int i=1;i<n;i++ ){
      int key = arr[i];
      int j = i-1;
      while (j>=0 && arr[j]>key) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1]=key;
    }
  }

  public static int smallestElement(int[] arr){
    Arrays.sort(arr);
    int n = arr[arr.length-2];
    return n;
  }

  public static void main(String[] args) {
    int[] arr = {2,8,0,7,1,3,9,5};
    // // bubbleSort(arr);
    // selectionSort(arr);
    // printArr(arr);
    System.out.println(smallestElement(arr));
  }
}
