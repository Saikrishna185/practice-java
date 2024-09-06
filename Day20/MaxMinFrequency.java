package Day20;
import java.util.HashMap;
public class MaxMinFrequency {
  static void display(HashMap<Integer,Integer> map){
    map.forEach((key, value) -> 
    {
      System.out.println(key + " " + value);
    });
  }
  public static void main(String[] args) {
    int[] arr = {1,2,1,3,2,2,4,4,5,5,5,2};
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    for(int i=0; i<arr.length; i++){
      if(hm.containsKey(arr[i])){
        hm.put(arr[i], hm.get(arr[i])+1);
      } else {
        hm.put(arr[i], 1);
      }
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxN = 0;
    int minN = 0;
    for(HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
      if(entry.getValue() > max) {
        max = entry.getValue();
        maxN = entry.getKey();
      }
      if(entry.getValue() < min) {
        min = entry.getValue();
        minN = entry.getKey();
      }
    }
    display(hm);
    System.out.println("Max Frequency: " + maxN);
    System.out.println("Min Frequency: " + minN);
  }
}
