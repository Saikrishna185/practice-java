package Day5.Patterns;

public class Ques33 {
  public static void main(String[] args) {
    int n =10;
    for(int i =1;i<=n;i++){
      for(int k=1;k<=n-i;k++){
        System.out.print("  ");
      }
      for(int j=n-1;j>=i;j--){
        System.out.print(j+" ");
      }

      System.out.print("0 ");

      // for(int j=1;j<=i-1;j++){
      //   System.out.print(j+" ");
      // }
      System.out.println();
    }
  }
}
