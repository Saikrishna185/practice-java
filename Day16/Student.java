package Day16;

public class Student {
  String name;
  int ID;
  int age;
  char Section;
  String branch;

  void intoduceYourself() throws Exception{
    System.out.println("My name is " + name);
    // System.out.println("My ID is " + ID);
    System.out.println("My age is " + age);
    // System.out.println("My Section is " + Section);
    // System.out.println("My branch is " + branch);
  }

  public Student() {
  }

  public Student(String name, int age) throws Exception{
    this.name = name;
    try {
      if (age <= 17) {
        throw new Exception("Age cannot be less than 18");
      }
      this.age = age;
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
    
    // this.ID = ID;
    // this.Section = Section;
    // this.branch = branch;
  }

  
}
