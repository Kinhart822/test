package Lab2_PhamHoangAnh_22BI13034.Exercise05;

public class Button {
    private String label;
    private String color;

    public String getColor() {
        return color;
    }
    public String getLabel() {
        return label;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setLabel(String newLabel) {
        label = newLabel;
    }
    public void dePress() {
        System.out.println("Button depressed");
    }
    public void unDepress() {
        System.out.println("Button un-depressed");
    }
}
