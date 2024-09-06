package Day14;

import java.util.ArrayList;
import java.util.List;

public class practice {

  public void subsetsRec(int[] nums, List<Integer> current, List<List<Integer>> ans, int itr) {
    // base
    if (itr == nums.length) {
      ans.add(new ArrayList<>(current));
      return;
    }
    // go
    current.add(nums[itr]);
    subsetsRec(nums, current, ans, itr + 1);
    current.remove(current.size() - 1);
    // not go
    subsetsRec(nums, new ArrayList<>(current), ans, itr + 1);
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    new practice().subsetsRec(nums, current, ans, 0);
    System.out.println(ans);
  }
}