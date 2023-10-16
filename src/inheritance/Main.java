package inheritance;

import inheritance.shapes.Circle;
import inheritance.shapes.Polygon;
import inheritance.shapes.Shape;
import inheritance.vehicles.Car;
import inheritance.vehicles.FuelType;
import inheritance.vehicles.Plane;
import inheritance.vehicles.Vehicle;
import utils.General;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Shape shape1 = new Shape("Red");

//    System.out.println(shape1.getColor());

    Polygon polygon = new Polygon(4, 3, "Blue");

//    System.out.println(polygon.getCorners());
//    System.out.println(polygon.getLineWidth());
//    polygon.setColor("Teal");
//    System.out.println(polygon.getColor());

    Shape polygonShape = new Polygon(4, 3, "Pink");

    System.out.println("polygonShape is Shape? " + General.prettyPrintBoolean(polygonShape instanceof Shape));
    System.out.println("polygonShape is Polygon? " + General.prettyPrintBoolean(polygonShape instanceof Polygon));
    System.out.println("polygonShape is Circle? " + General.prettyPrintBoolean(polygonShape instanceof Circle));

    ((Polygon) polygonShape).getCorners();

    /*
    Car car = new Car("Toyota", "Red", 2015,
        "Camry", FuelType.GASOLINE, 2.5f);

    Vehicle plane = new Plane("Boeing", "White", 2010,
        "747", 4);

    */
  }
}
