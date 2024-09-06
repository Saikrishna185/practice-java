package Day5.Patterns;

public class Ques25 {
  public static void main(String[] args) {
    int n = 4;
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int k = 1; k <= n - i; k++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }
}
