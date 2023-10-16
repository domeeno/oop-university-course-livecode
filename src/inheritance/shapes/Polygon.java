package inheritance.shapes;

public class Polygon extends Shape {
  private int corners;
  private int lineWidth;

  public Polygon(int corners, int lineWidth, String color) {
    super(color);
    this.corners = corners;
    this.lineWidth = lineWidth;
  }

  public int getCorners() {
    return corners;
  }

  public void setCorners(int corners) {
    this.corners = corners;
  }

  public int getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(int lineWidth) {
    this.lineWidth = lineWidth;
  }
}
