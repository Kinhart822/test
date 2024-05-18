public class Main {
  abstract class Shape {
    public double calArea() {
      return 0;
    }

    public double calVolume() {
      return 0;
    }
    abstract public String getName();
  }

  public class Point extends Shape {
    public double x;
    public double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public double calArea() {
      return 0;
    }

    public double calVolume() {
      return 0;
    }

    public String getName() {
      return "Point";
    }
  }

  public class Circle extends Point {
    public double r;

    public Circle(double x, double y, double r) {
      super(x, y);
      this.r = r;
    }

    public double getR() {
      return r;
    }

    public double calArea() {
      return Math.round(Math.PI * r * r * 100.0) / 100.0;
    }

    public double calVolume() {
      return 0;
    }

    public String getName() {
      return "Circle";
    }
  }

  public class Cylinder extends Circle {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
      super(x, y, r);
      this.h = h;
    }

    public double getH() {
      return h;
    }

    public double calArea() {
      return Math.round(2 * Math.PI * r * (r + h) * 100.0) / 100.0;
    }

    public double calVolume() {
      return Math.round(Math.PI * r * r * h * 100.0) / 100.0;
    }

    public String getName() {
      return "Cylinder";
    }
  }
}
