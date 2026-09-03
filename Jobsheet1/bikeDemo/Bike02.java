package bikeDemo;
/**
 * Bike01
 */
public class Bike02 {
    private String brand;
    private int speed, gear = 1;

    // gear jika bernilai 1, berarti batas kecepatannya 5
    private final int[] GEAR_SPEED_LIMITS = {
            5, 10, 25, 30, 40, 60
    };

    // properti dibuat private, hanya method untuk mengaksesnya yang diberi akses
    // public
    // agar file lain tidak bisa dengan mudah mengakses properti tersebut seperti
    // bike.gear
    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {// gear dibawah 1 dan diatar 6 tidak valid
            System.out.println("Invalid gear value, Gear must be between 1 and 6");
        } else {
            gear = gearValue;// jika valid, maka gear dirubah ke nilai yang tertera pada parameter
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo(){
        System.out.println("Brand   : "+brand);
        System.out.println("Speed   : "+speed);
        System.out.println("Gear    : "+gear);
    }
    
}
