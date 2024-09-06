package Day10;
import java.util.Arrays;
public class Ques1 {
  public static void main(String[] args) {
    int []arr = {1,3,9,11,3,6,12,16,9,7,6,20,8,16};
    Arrays.sort(arr);
    BinarySearch bs = new BinarySearch();
    System.out.println(arr[bs.upperBound(arr, 10)]);
    System.out.println(arr[bs.lowerBound(arr, 10)]);

  }
}
