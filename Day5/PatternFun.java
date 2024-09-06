package Day5;

import java.util.Scanner;
public class PatternFun {

  public static void main(String[] args) {
    rightTriangle();

    // rightInvTriangle();

    // leftTriangle(); 
    
    // leftInvTriangle();

    // invPyramid();

    // pyramid();

    // LIhalfArrow();

  }

  //Space function
  public static void spases(int a){
    for(int i=1;i<=a;i++){
       System.out.print("  ");
    }
  }

  //Stars function
  public static void stars(int a){
    for(int i=1;i<=a;i++){
       System.out.print("* ");
    }
  }

  //Numeric function
  public static void Numbers(int a){
    for(int i=1;i<=a;i++){
       System.out.print(i+" ");
    }
  }

  //Reverse Numeric function
  public static void revNumbers(int a){
    for(int i=a;i>=1;i--){
       System.out.print(i+" ");
    }
  }

  //Reverse Diagonal function
  public static void revDiagonal(int a){
    for(int i=1;i<=a;i++){
      for(int j=1;j<=a;j++){
        if(j+i==a+1){
            System.out.print("* ");
        }
        else{
           System.out.print("  ");
        }
      }
    }
  }

  
  //Patterns
  //Right Triangle
  public static void rightTriangle(){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      stars(i);
      System.out.println();
    }
    sc.close();
  }

  //Right Inverted Triangle
  public static void rightInvTriangle(){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      stars(i);
      System.out.println();
    }
    sc.close();
  }

  //Left Triangle
  public static void leftTriangle() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      spases(n - i);
      stars(i);
      System.out.println();
    }
    sc.close();
  }

  //Left Inverted Triangle
  public static void leftInvTriangle() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      spases(n - i);
      stars(i);
      System.out.println();
    }
    sc.close();
  }

  //Pyramid
  public static void pyramid() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      spases(n - i);
      stars(2 * i - 1);
      System.out.println();
    }
    sc.close();
  }

  //Inverted Pyramid
  public static void invPyramid() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      spases(n - i);
      stars(2 * i - 1);
      System.out.println();
    }
    sc.close();
  }

  //Left Inverted Half Arrow
   public static void LIhalfArrow() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = n; i >= 1; i--){
      spases(2*(n-i));
      stars(i);
      System.out.println();
    }
    sc.close();
   }

  //Left Half Arrow
  public static void LhalfArrow() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      spases(2 * (n - i));
      stars(i);
      System.out.println();
    }
    sc.close();
  }
}
