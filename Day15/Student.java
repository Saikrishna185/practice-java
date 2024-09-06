package Day15;
public class Student {
  String name;
  int ID;
  int age;
  char Section;
  String branch;

  void intoduceYourself(){
    System.out.println("My name is "+name);
    System.out.println("My ID is "+ID);
    System.out.println("My age is "+age);
    System.out.println("My Section is "+Section);
    System.out.println("My branch is "+branch);
  }

  public Student(){
  }
  public Student(String name, int ID,int age, char Section, String branch){
    this.name = name;
    this.ID = ID;
    this.age = age;
    this.Section = Section;
    this.branch = branch;
  }
}
