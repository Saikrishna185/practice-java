package Day16;

public class Car extends vehicle {
  int maxSpeed = 180;
  void display(){
    System.out.println("Max Speed: "+maxSpeed);
  }
  public static void main(String[] args) {
    Car car = new Car();
    car.display();
  }
}
