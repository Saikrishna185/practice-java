package Day14;

public class ReccursivePt2 {
  public static void validParentheses(int n, int open,int close, String str) {
    if(open == n && close == n){
      System.out.println(str+" ");
    }
    if( open > n || close > open){
      return;
    }
    validParentheses(n, open + 1, close, str + "(");
    validParentheses(n, open, close + 1, str + ")");
  }

  public static void main(String[] args) {
    validParentheses(3, 0, 0, "");
  }
}
