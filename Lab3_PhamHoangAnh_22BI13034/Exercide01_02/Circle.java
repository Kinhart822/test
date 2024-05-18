package Lab3_PhamHoangAnh_22BI13034.Exercide01_02;

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
