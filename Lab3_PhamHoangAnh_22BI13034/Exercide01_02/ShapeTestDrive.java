package Lab3_PhamHoangAnh_22BI13034.Exercide01_02;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Point(1, 2);
        shapes[1] = new Circle(3, 4, 5);
        shapes[2] = new Cylinder(6, 7, 8, 9);

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Area: " + shape.calArea());
            System.out.println("Volume: " + shape.calVolume());
            System.out.println();
        }
    }
}
