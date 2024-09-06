package Day17;
import java.util.Stack;
public class NextGreaterElement {
  int[] rightNGE(int[] arr){
    int[] right = new int[arr.length];
    Stack<Integer> stack = new Stack<>();

    for(int i = arr.length-1; i >= 0; i--){
      while (!stack.isEmpty() && stack.peek() < arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        right[i] = -1;
      }
      else {
        right[i] = stack.peek();
      }
      stack.push(arr[i]);
    }
    return right;
  }
  int[] leftNGE(int[] arr){
    int[] left = new int[arr.length];
    Stack<Integer> stack = new Stack<>();

    for(int i = 0; i < arr.length; i++){
      while (!stack.isEmpty() && stack.peek() < arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        left[i] = -1;
      }
      else {
        left[i] = stack.peek();
      }
      stack.push(arr[i]);
    }
    return left;
  }
  public static void main(String[] args) {
    NextGreaterElement nge = new NextGreaterElement();
    int[] arr = {8,2,7,3,4,6,10};
    int[] right = nge.rightNGE(arr);
    int[] left = nge.leftNGE(arr);
    for(int i = 0; i < right.length; i++) {
      System.out.print(right[i]+" ");
    }
    System.out.println();
    for(int i = 0; i < arr.length; i++){
      System.out.print( left[i]+" ");
    }
  }
}
