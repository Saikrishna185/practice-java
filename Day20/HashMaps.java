package Day20;
import java.util.HashMap;
public class HashMaps {
  public static void main(String[] args) {
    String[] arr = {"Sai","Sagar","Balu","Suraj"};
    
    HashMap<Character, String> hm = new HashMap<Character, String>();
    
    // for(int i = 0; i < arr.length; i++) {
    //   hm.put((char)(97+i), arr[i]);
    // }
    for (char i = 'a'; i-97 < arr.length; i++) {
      hm.put(i, arr[i-97]);
    }
    // System.out.println(hm.get(0));

    for(HashMap.Entry<Character, String> entry : hm.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }

}
