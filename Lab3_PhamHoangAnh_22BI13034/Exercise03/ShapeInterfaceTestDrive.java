package Lab3_PhamHoangAnh_22BI13034.Exercise03;

public class ShapeInterfaceTestDrive {
    public static void main(String[] args) {
        ObjectInterface.Point point = new ObjectInterface().new Point(1, 2);
        ObjectInterface.Circle circle = new ObjectInterface().new Circle(1, 2, 3);
        ObjectInterface.Cylinder cylinder = new ObjectInterface().new Cylinder(1, 2, 3, 4);
        System.out.println("Point: " + point.getName() + ", area: " + point.calArea() + ", volume: " + point.calVolume());
        System.out.println("Circle: " + circle.getName() + ", area: " + circle.calArea() + ", volume: " + circle.calVolume());
        System.out.println("Cylinder: " + cylinder.getName() + ", area: " + cylinder.calArea() + ", volume: " + cylinder.calVolume());
    }
}
