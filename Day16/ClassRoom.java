package Day16;

public class ClassRoom {
  public static void main(String[] args) throws Exception {
    Student student1 = new Student();
    // student1.name = "Sai Krishna";
    // student1.ID = 185;
    // student1.age = 21;
    // student1.Section = 'C';
    // student1.branch = "CSE";
    // student1.intoduceYourself();

    // System.out.println();

    Student student2 = new Student("Suraj", 15);
    // student2.name = "Jane";
    // student2.ID = 124;
    // student2.Section = 'B';
    // student2.branch = "ECE";
    student2.intoduceYourself();
  }
}
