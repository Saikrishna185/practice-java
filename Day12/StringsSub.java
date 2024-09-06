// package Day12;
// import java.util.*;
public class StringsSub {
  // Pallindrome Function
  public static boolean isPallindrome(String s){
    int i = 0;
    int j = s.length()-1;
    while(i<j){
      if(s.charAt(i) != s.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  // Good SubString Function
  public static void goodSubString(String s){
    // String s1 = "aeiou";
    for(int i = 0; i < s.length(); i++){
      for(int j = i+1; j < s.length()+1;j++){
        System.out.println(s.substring(i, j));
      }
    }
  }

  // Reverse String Function
  public static String reverseString(String s){
    s.trim();
    String[] str = s.split("\s+");
    String ans ="";
    for(int i=str.length-1; i>=0; i--){
      ans += str[i]+" ";
    }
    return ans.trim();
  }
  public static void main(String[] args) {
    // String s1 = "arrays";
    // String s2 = "aeiou";
    String s3 = "Suraj is very intelligent and very smart but a bad boy";
    // System.out.print(s1.substring(0,5));
    // System.out.println(isPallindrome(s1));
    // goodSubString(s1);
    System.out.print(reverseString(s3));
  }
}
