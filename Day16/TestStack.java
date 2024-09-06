package Day16;

class TestStack {
  public static void main(String[] args) {
    Stacks stk = new Stacks();
    System.out.println("Is Empty " + stk.isEmpty());
    System.out.println("Is Full " + stk.isFull());
    System.out.println("Is Pointing at " + stk.pointer());
    stk.insert(1);
    stk.insert(2);
    stk.remove();
    stk.insert(3);
    stk.insert(4);
    stk.insert(5);
    // stk.insert(0);
    stk.display();
    System.out.println("Is Pointing at " + stk.pointer());
    System.out.println("Size: " + stk.size());
    System.out.println("Is Empty " + stk.isEmpty());
    System.out.println("Is Full " + stk.isFull());
  }  
}
