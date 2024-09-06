package Day10;

public class BinarySearch {
  public static int search(int[] arr, int target){
    int s = 0;
    int e = arr.length-1;
    while (s <= e){
      int mid = (s+e)/2;
      if (arr[mid] == target){
        return mid;
      }
      else if(arr[mid] < target){
        s = mid+1;
      }
      else{
        e = mid-1;
      }
      
    }
    return -1;
  }
  
  public static int lowerBound(int[] arr, int target) {
    int s = 0;
    int e = arr.length - 1;
    int ans = arr.length;
    while (s <= e) {
      int mid = (s + e) / 2;
      if (arr[mid] <= target) {
        ans = mid;
        s = mid+1;
      } else {
        e = mid-1;
      }

    }
    return ans;
  }
  
  public static int upperBound(int[] arr, int target) {
    int s = 0;
    int e = arr.length - 1;
    int ans = arr.length;
    while (s <= e) {
      int mid = (s + e) / 2;
      if (arr[mid] > target) {
        ans = mid;
        e = mid - 1;
      } else {
        s = mid + 1;
      }

    }
    return ans;
  }
}
