package Day5;

public class FunctionOne {
  public static void printer(){
    System.out.println("Function");
  }

  public static int sum(int a, int b){
    int s = a + b;
    return s;
  }

  public static int printer3(int a, int b, int c){
    int sum = a + b + c;
    System.out.println(sum);
    return sum;
  }

  public static int product(int a, int b){
    int p = a * b;
    return p;
  }

  public static void main(String[] args){
    
    int x = 6;
    int y = 5;
    //int z = 1;
    int summation = sum(x,y);
    System.out.println(summation);
    System.out.println(product(5, 2));
  }
}
