package Lab2_PhamHoangAnh_22BI13034.Exercise05;

public class ButtonTextDrive {
    public static void main(String[] args) {
        Button function = new Button();
        function.setColor("green");
        function.setLabel("light switch");
        System.out.println("Color: " + function.getColor());
        System.out.println("Label: " + function.getLabel());
        function.dePress();
        function.unDepress();
    }
}