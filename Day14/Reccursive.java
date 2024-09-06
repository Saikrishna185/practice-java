package Day14;

public class Reccursive {
  public static void reverseString(String s){
    if(s.length() == 0) return;
    reverseString(s.substring(1));
    System.out.print(s.charAt(0));
  }
  public static void reverseStringFront(String s, int i, String rev){
    if(i == 0){
      System.out.println(rev);
      return;
    }
    reverseStringFront(s, i-1, rev+s.charAt(i-1));
  }
  public static void reverseStringBack(String s, int i, String rev){
    if(i == s.length()){
      System.out.println(rev);
      return;
    }
    reverseStringBack(s, i+1, rev+s.charAt(i));
  }
  public static float average(int[] arr){
    float sum = 0;
    for(int i=0; i<arr.length; i++){
      sum +=arr[i];
    }
    return sum/arr.length;
  }

  public static float mean(int[] arr,int itr){
    if(itr == 0){
      return arr[itr];
    }
    return (mean(arr, itr - 1)*itr+arr[itr] )/(float)(itr+1);
  }
  public static void main(String[] args) {
    // String s = "Suraj";
    // reverseString(s);

    int[] arr = {1,2,1};
    System.out.println(mean(arr,arr.length-1));
  }
}
