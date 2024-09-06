package Day6;

// import java.util.*;
public class ArrayEx {
  public static void main(String[] args) {
    int[] arr = new int[5];
    // System.out.println(arr[0]);
    // arr = new int[]{1, 2, 3, 4, 5};

    for(int i =0;i<5;i++){
      arr[i]=i;
    }
    for(int i =0;i<5;i++){
      System.out.println(arr[i+1]);
    }
  }
}
