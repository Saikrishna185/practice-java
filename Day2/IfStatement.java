package Day2;

import java.util.Scanner;
public class IfStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // if (a>1) {
    //   System.out.println("a is greater than 1");
    // } else if (a == 1) {
    //   System.out.println("a is not greater than 1");
    // }

    // for (int i =1;i<=a;i++){
    //   System.out.println(i+" Sai");
    // }

    // while(a>0){
    //   System.out.println(a);
    //   a--;
    // }

    do{
      System.err.println(a);
      a--;
    }while(a>0);

    sc.close();
  }
  
}
