package Day13;
public class Recursion1 {
  public static int searchRoll(int[] rollList, int roll){
    for(int i = 0; i < rollList.length; i++){
      if(rollList[i] == roll){
        return i;
      }
    }
    return -1;
  }

  public static int searchRollRec(int[] rollList, int roll  , int index){
    if(rollList[index] == roll){
      return index;
    }
    return searchRollRec(rollList, roll, index+1);
  }

  public static int sumRec(int[] nums, int sum, int i){
    if(i == nums.length) return 0;
    return nums[i] + sumRec(nums, sum, i+1);
  }

  public static int factorial(int n) {
    if (n == 0)
      return 1;
    return n * factorial(n - 1);
  }

  public static void coinChange(int n, String str){
    if(n == 0){
      System.out.println(str);
      return;
    }
    coinChange(n-1, str + "H ");
    coinChange(n-1, str + "T ");
  }

  public static void main(String[] args) {
    // int[] rollList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // int roll = 5;
    // System.out.println(searchRoll(rollList, roll));
    // System.out.println(factorial(5));
    // int[] nums = {1, 2, 3, 4, 5};
    // System.out.println(sumRec(nums, 0, 0));

    coinChange(4, "");
  }
}
