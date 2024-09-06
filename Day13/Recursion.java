package Day13;

public class Recursion {
  public static int factorial(int n){
    if(n == 0) return 1;
    return n*factorial(n-1);
  }


  //tail recursion factorial
  public static int factorial(int n, int ans){
    if(n == 0) return ans;
    return factorial(n-1, n*ans);
  }


  public static int power(int n, int p){
    // int power = 1;
    // for(int i=0; i<p; i++){
    //   power *= n;
    // }
    // return power;
    if (p == 0) return 1;
    return n*power(n, p-1);
  }


  public static int sum(int n){
    if(n == 0) return 0;
    return n + sum(n-1);
  }

  public static int fibonacci(int n){
    // int a = 0;
    // int b = 1;
    // if (n == 0 || n == 1) return n;
    // for(int i=1; i<n; i++){
    //   int sum = a + b;
    //   a = b;
    //   b = sum; 
    // }
    // return (b);
    if(n == 0 || n == 1) return n;
    return fibonacci(n-1)+ fibonacci(n-2);
  }


  public static void main(String[] args) {
    //int n = 5;
    // System.out.println(factorial(n));
    // System.out.println(sum(5));
    System.out.println(fibonacci(2));
  }
}


