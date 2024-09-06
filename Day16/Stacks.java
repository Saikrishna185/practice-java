package Day16;

import java.util.Stack;

public class Stacks {
  int[] stack = new int[5];
  int index = -1;
  void insert(int data) {
    if (this.index == stack.length-1) {
      System.out.println("Stack is full");
    }
    else {
      this.index++;
      stack[this.index] = data;
    }
  }
  void remove() {
    if (this.index >= 0) {
      this.index--; 
    }
    else{
      System.out.println("Stack is empty");
    }
  }
  int size(){
    return this.index+1;
  }
  void display() {
    for (int i = 0; i <= this.index; i++) {
      System.out.print(stack[i] + " ");
    }
    System.out.println();
  }
  int pointer(){
    if(this.index == -1){
      return -1;
    }
    return stack[this.index];
  }
  boolean isEmpty(){
    return this.index == -1;
  }
  boolean isFull(){
    return this.index == stack.length-1;
  }
}
