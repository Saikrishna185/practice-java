package Day8;

public class RotateArr {

  public static void swap(int[] a,int start,int end) {

    int x = start, y = end;
    while (x < y) {
      int temp = a[x];
      a[x] = a[y];
      a[y] = temp;
      x++;
      y--;
    }
  }

  public static void printArr(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void shiftByOne(int[] arr){
    int n = arr.length;
    int temp = arr[n-1];

    for(int i =n-1; i>0;i--){
      arr[i] = arr[i-1];
    }
    arr[0] = temp;

    printArr(arr);
  }

  public static void shiftByD(int[] arr, int d) {
    int n = arr.length;
    int[] temp = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[n-d+i];
    }

    for (int i = n - 1; i >= d; i--) {
      arr[i] = arr[i - d];
    }

    for (int i = 0; i < d; i++) {
      arr[i] = temp[i];
    }
    printArr(arr);
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    int d = 10;
    d %= arr.length;

    //Shift by one
    // shiftByOne(arr);

    //Shift by D
    shiftByD(arr, d);
    // int n = arr.length;
    // int temp = arr[n-1];

    // for(int i =n-1; i>0;i--){
    //   arr[i] = arr[i-1];

    // }
    // arr[0] = temp;

    // for(int i=0; i<n; i++){
    //   System.out.print(arr[i]+" ");
    // }
  }
}
