package encapsulation;


// Rectangle is a class that represents a rectangle in 2D space.
public class Rectangle {

  private Point2D origin;
  private int width, height;
  private int area;

  public Rectangle(Point2D origin, int width, int height) {
    this.origin = origin;
    this.width = width;
    this.height = height;

    // Calculate the area of the rectangle.
    this.area = width * height;
  }

  public int getArea() {
    return area;
  }

/*
  Old functionality, before we added the area field, we would
  need to make a calculation everytime we wanted to get the area of Rect.

  public int getArea() {
    return this.width * this.height;
  }
*/

  public void setArea(int area) {
    this.area = area;
  }

  public Point2D getOrigin() {
    return origin;
  }

  public void setOrigin(Point2D origin) {
    this.origin = origin;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
    this.area = width * this.height;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
    this.area = height * this.width;
  }

}
