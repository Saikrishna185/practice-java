package Day5.Patterns;

public class Ques32 {
  public static void main(String[] args) {
    int n = 5;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=2*i-1; j++){
        if(j%2==0){
          System.out.print("* ");
        } else {
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }
    for (int i = n-1; i >= 0; i--) {
      for (int j = 1; j <= 2*i-1; j++) {
        if (j % 2 == 0) {
          System.out.print("* ");
        } else {
          System.out.print(i + " ");
        }
      }
      System.out.println();
    }
  }
}
