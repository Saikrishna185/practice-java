package Day14;

public class Revision {
  public static void coinChanged( int n, String str){
    if(n == 0){
      System.out.println(str);
      return;
    }
    coinChanged(n-1, str + "H ");
    coinChanged(n-1, str + "T ");
  }
  public static void printAccending(int n){
    if(n == 0) return;
    printAccending(n-1);
    System.out.println(n);
  }

  public static void printDecending(int n){
    if(n == 0) return;
    System.out.println(n);
    printDecending(n-1);
  }

  public static void printAccendingItr(int n, int i){
    if(i == n) return;
    System.out.println(i);
    printAccendingItr(n, i+1);
  }

  public static void printDecendingItr(int n, int i){
    if(i == n) return;
    printDecendingItr(n, i+1);
    System.out.println(i);
  }

  public static void coinChangedCons(int n, String str, char prev) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    coinChangedCons(n - 1, str + "0 ", '0');
    if(prev != '1' )
    coinChangedCons(n - 1, str + "1 ", '1');
    
  }
  public static void main(String[] args) {
    // coinChanged(3, "");
    // printAccendingItr(5,1 );
    coinChangedCons(3,"", '0');
  }
}
