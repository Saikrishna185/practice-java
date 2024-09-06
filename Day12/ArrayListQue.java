// package Day12;
// import java.util.*;
// public class ArrayListQue {
//   // 1. Take the size of the arraylist as an input: n//
//   // 2. Take the elements as an input.//
//   // 3. Sort the arraylist.//
//   // 4. Sum of the arrayList.
//   // 5. Smallest/Largest number in your arraylist.
//   // 6. Average of the whole arraylist.
//   // 7. Make another arraylist of type string
//   // 8. Take a sentence as an input,and store the words in your new arraylist.
//   // 9. Print the index of words that are a pallindrome.
//   // 10. Print the String in a reverse order via Arraylist.
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // 1. Take the size of the arraylist as an input: n
//     int n = sc.nextInt();
//     ArrayList<Integer> arr = new ArrayList<>();
//     for(Integer i = 0; i <n; i++) {
//       arr.add(sc.nextInt());
//     }
//     Collections.sort(arr);
//     int sum = 0;
//     for(Integer i:arr) {
//       sum += i;
//     }
//     System.out.println(arr.get(0)+" "+arr.get(n-1));
//     System.out.println((double)sum/n);

//     ArrayList<String> s ;
//     String str = sc.nextLine().trim();
//     String[] arr1 = str.split("\s+");
//     s = new ArrayList<String>(Arrays.asList(arr1));

//     Collections.reverse(s);
//     String ans = String.join(" ",s)

//   }
// }
