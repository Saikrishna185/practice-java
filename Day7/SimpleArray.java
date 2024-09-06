package Day7;

public class SimpleArray {
  public static void findLast(int[] arr,int key){
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i]==key){
        System.out.println("Last occurence of "+key+" is at index "+i);
        return;
      } 
    }
    System.out.println("Element not found");
  }


  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,4,5,9,3,2};
    findLast(arr,3);
  }
}
