package Lab2_PhamHoangAnh_22BI13034.Exercise06;

public class Automobile {
    private double fuel;
    private double speed;
    private String license;

    public double getFuel() {
        return fuel;
    }
    public double getSpeed() {
        return speed;
    }
    public String getLicense() {
        return license;
    }
    public void init(double newFuel, double newSpeed, String newLicense) {
        fuel = newFuel;
        speed = newSpeed;
        license = newLicense;
    }
    public void accelerate(double v) {
        if (v > 0 && fuel > 0) {
            speed += v;
        }
    }
    public void decelerate(double v) {
        if (v > 0 && fuel <= 0) {
            speed -= v;
        }
    }
    public String toString() {
        return "Fuel: " + fuel + " Speed: " + speed + " License: " + license;
    }
}



