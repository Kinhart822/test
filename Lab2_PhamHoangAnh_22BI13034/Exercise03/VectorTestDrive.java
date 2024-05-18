package Lab2_PhamHoangAnh_22BI13034.Exercise03;

public class VectorTestDrive {
    public static void main(String[] args) {
        Vector vector_1 = new Vector(1, 2);
        Vector vector_2 = new Vector(3, 4);
        System.out.println("Vector 1: " + vector_1);
        System.out.println("Vector 2: " + vector_2);
        System.out.println("Vector 1 + Vector 2 = " + vector_1.add(vector_2));
        System.out.println("Vector 1 - Vector 2 = " + vector_1.subtract(vector_2));
        System.out.println("Vector 1 * Vector 2 = " + vector_1.multiply(vector_2));
    }
}