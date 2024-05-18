package Lab3_PhamHoangAnh_22BI13034.Exercide01_02;

class Point extends Shape {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcArea() {
        return 0;
    }

    public double calcVolume() {
        return 0;
    }
    
    public String getName() {
        return "Point";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}