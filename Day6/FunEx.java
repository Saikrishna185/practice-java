package Day6;

public class FunEx {
  public static int searchRoll(int[] a, int b){
    for(int i=0; i<a.length; i++){
      if(a[i]== b) return i;
    }
    return -1;
  }

  public static int findSmallest(int[] a){
    int Storage = a[0];
    for(int i=0; i<a.length;i++) {
      if(a[i]<=Storage) 
        return a[i];
      else
        continue;
    }
    return Storage;
  }

  public static int findLargest(int[] a){
    int Storage = a[0];
    for(int i=0; i<a.length;i++){
      if(a[i]>=Storage)
        Storage = a[i];
      else
        continue;
    }
    return Storage;
  }

  public static int findSum(int[] a){
    int sum = 0;
    for(int i=0; i<a.length;i++){
      sum += a[i];
    } 
    return sum;
  }

  public static int findSumRange(int[] a, int start, int end){
    int sum = 0;
    if (start<0 || end>a.length) return 0;
    for(int i=start; i<=end; i++){
      sum += a[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    int []x = {1,2,3,4,5};
    // int y = 6;
    // System.out.println("At index : "+searchRoll(x, y));
    // System.out.println("Smallest value : "+findSmallest(x));
    // System.out.println("Largest value : " + findLargest(x));
    // System.out.println("Sum of values :" + findSum(x));
    // System.out.println("Sum of ranged values :" + findSumRange(x,2,4));
    System.out.println(x.length);

  }
}
