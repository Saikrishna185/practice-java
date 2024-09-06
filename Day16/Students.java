package Day16;

public class Students {
  private int no_of_students=0;
  private int no_of_subjects=0;

  void student(){
    no_of_students++;
    no_of_subjects++;
  }

  public int getStudent(){
    return no_of_students;
  }

  public int getSubject(){
    return no_of_subjects;
  }

  public void setStudent(){
    this.no_of_students = no_of_students;
  }

  public void setSubject(){
    this.no_of_subjects = no_of_subjects;
  }
}
