package Day11;

import java.util.Arrays;

public class AggressiveCows {
  public static int bookShare(int[] stable,int c){
    int ans = -1;
    int i = Arrays.stream(stable).min().getAsInt();
    int j = Arrays.stream(stable).max().getAsInt()-i;
    while(i<=j){
      int mid = i+(j-i)/2;
      // if(){
      //   ans = mid;
      //   j = mid-1;
      // }
      // else{
      //   i = mid+1;
      // }
    }
    return ans;
  }
}
