package polymorphism.classexample;

public class MathUtils {
  // Method overloading
  public static int add(int a, int b) {
    int result = a + b;
    System.out.println("int add(a, b): " + result);
    return result;
  }

  public static int add(int a, int b, int c) {
    int result = a + b + c;
    System.out.println("int add(a, b, c): " + result);
    return result;
  }

  public static double add(double a, double b) {
    double result = a + b;
    System.out.println("double add(a, b): " + result);
    return result;
  }
}
