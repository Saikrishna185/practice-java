package Day13;

public class SubSequences {
  static void subSeq(String s, String ans){
    if(s.isEmpty()){
      System.out.println(ans);
      return;
    }
    char ch = s.charAt(0);
    
    subSeq(s.substring(1), ans);
    subSeq(s.substring(1), ans + ch);
    
  }
  public static void main(String[] args) {
    String s = "cart";
    subSeq(s, "");
  }
}
