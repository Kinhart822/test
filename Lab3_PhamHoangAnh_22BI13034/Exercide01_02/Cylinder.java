package Lab3_PhamHoangAnh_22BI13034.Exercide01_02;

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
