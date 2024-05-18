package Lab2_PhamHoangAnh_22BI13034.Exercise03;

public class Vector {
    private int x;
    private int y;

    public Vector(int xInput, int yInput) {
      x = xInput;
      y = yInput;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
    public Vector add(Vector v) {
        int new_x = x + v.x;
        int new_y = y + v.y;
        return new Vector(new_x, new_y);
    }
    public Vector subtract(Vector v) {
        int new_x = x - v.x;
        int new_y = y - v.y;
        return new Vector(new_x, new_y);
    }
    public Vector multiply(Vector v) {
        int new_x = x * v.x;
        int new_y = y * v.y;
        return new Vector(new_x, new_y);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}