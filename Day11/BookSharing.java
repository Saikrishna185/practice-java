package Day11;

import java.util.*;

public class BookSharing {

  // public static int sum(int[] arr) {
  //   int sumArr = 0;
  //   for (int i = 0; i < arr.length; i++) {
  //     sumArr += arr[i];
  //   }
  //   return sumArr;
  // }

  public static boolean check(int[] arr,int maxPages,int s){
    int cSum = 0;
    int cStudent = 1;
    for(int i:arr){
      if(cSum+i <= maxPages){
        cSum += i;
      }
      else{
        cStudent++;
        if(cStudent > s || i > maxPages)
          return false;

          
        else
          cSum = i;
      }

    }
    return true;
  }

  public static int bookShare(int[] book,int s){
    int ans = -1;
    int i = 0;
    int j = Arrays.stream(book).sum();
    while(i<=j){
      int mid = i+(j-i)/2;
      if(check(book,mid,s)){
        ans = mid;
        j = mid-1;
      }
      else{
        i = mid+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {10,20,30,40};
    System.out.print(bookShare(arr,2));
  }
}