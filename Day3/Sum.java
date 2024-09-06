package Day3;
import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a ;
    int b ;

    a = sc.nextInt();
    b = sc.nextInt();

    int sum = a + b;

    System.out.println(sum);

    sc.close();
  }
}
