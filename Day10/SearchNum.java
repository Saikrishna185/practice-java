package Day10;

public class SearchNum {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,6,7,8,9,10};
    int target = 5;
     BinarySearch bs = new BinarySearch();
    System.out.println(bs.upperBound(arr, target));
  }
}
// Is System a java file or directory.
// Answer: System is a class in java.lang package.