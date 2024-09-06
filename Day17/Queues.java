package Day17;

public class Queues {
  private int arr[];
  private int start,end,currSize,maxSize;
  
  public Queues() {
    maxSize = 5;
    arr = new int[maxSize];
    start = -1;
    end = -1;
    currSize = 0;
  }
  public Queues(int maxSize){
    this.maxSize = maxSize;
    arr = new int[maxSize];
    start = -1;
    end = -1;
    currSize = 0;
  }
  public void push(int data){
    if(currSize == maxSize){
      System.out.println("Queue is full");
      System.exit(0);
    }
    if(end == -1){
      start = 0;
      end = 0;
    }
    else if(end == maxSize-1){
      end = 0;
    }
    else{
      end = (end + 1) % maxSize;
    }
    arr[end] = data;
    currSize++;
  }
  public int pop(){
    if(start == -1){
      System.out.println("Queue is empty");
      System.exit(1);
    }
    int data = arr[start];
    if(currSize == -1){
      start = -1;
      end = -1;
    }
    else if(start == maxSize-1){
      start = 0;
    }
    else{
      start = (start + 1) % maxSize;
    }
    currSize--;
    return data;
  }
  public int top(){
    if(start == -1){
      System.out.println("Queue is empty");
      System.exit(1);
    }
    return arr[start];
  }
  public int size(){
    return currSize;
  }
  public boolean isEmpty(){
    return start == -1;
  }
  public void display(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return;
    }
    int i = start;
    while(i != end){
      System.out.print(arr[i] + " ");
      i = (i + 1) % maxSize;
    }
    System.out.println(arr[end]);
  }
}
