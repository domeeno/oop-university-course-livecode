package inheritance.shapes;

public class Circle extends Shape {
  private int radius;

  public Circle(String color, int radius) {
    super(color);
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
}
