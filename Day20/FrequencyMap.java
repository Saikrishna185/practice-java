package Day20;
import java.util.HashMap;
public class FrequencyMap {
  static void display(HashMap<Integer,Integer> map){
    map.forEach((key, value) -> 
    {
      System.out.println(key + " " + value);
    });
  }
  public static void main(String[] args) {
    int[] arr = {1,4,5,6,7,8,1,7,8,9};
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    for(int i=0; i<arr.length; i++){
      if(hm.containsKey(arr[i])){
        hm.put(arr[i], hm.get(arr[i])+1);
      } else {
        hm.put(arr[i], 1);
      }
    }
    for(HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}
