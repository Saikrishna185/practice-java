package Day7;

public class Example {
  public static int findSum(int[] a){
    int sum =0;
    for(int i=0; i<a.length; i++){
      sum += a[i];
    }
    return sum;
  }

  public static void reverse(int[] a){

    int x = 0, y = a.length - 1;
    // for(int i=y; i>=x; i--){
    //   System.out.print(a[i]+" ");
    // }

    
    while(x<y){
      int temp = a[x];
      a[x] = a[y];
      a[y] = temp;
      x++;
      y--;
    }
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    reverse(arr);
    System.out.println(findSum(arr));

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
