package Day5.Patterns;

public class Ques29 {
  public static void main(String[] args) {
    int n = 5;
    // int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int k = 1; k <= n - i; k++) {
        System.out.print("  ");
      }
      System.out.print(i+" ");
      for (int j = 2; j < 2*i-1; j++) {
        System.out.print("0 ");
      }
      if(i!=1){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}
