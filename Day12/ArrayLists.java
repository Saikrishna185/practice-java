// package Day12;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
  public static void main(String[] args) {
    // 1. Syntax
    ArrayList<Integer> arr = new ArrayList<>();
    // 2. Add a new element
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(50);
    arr.add(60);
    arr.add(5,40);
    // 3. Access the element
    System.out.println(arr.get(0));
    // 4. Delete the element
    arr.remove(0);
    // 5. Update the element
    arr.set(0, 100);
    arr.set(2,arr.get(2)+10);
    // 6. Size of the arrayList
    System.out.println(arr.size());
    // 7. Sort the arrayList
    Collections.sort(arr);
    // Display the ArrayList
    System.out.print(arr);
  }
}
