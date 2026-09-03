package bikeDemo;

/**
 * BikeDemo01
 */
public class BikeDemo01 {
    public static void main(String[] args) {
        Bike01 mountainBike1 = new Bike01();
        Bike01 mountainBike2 = new Bike01();
    

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();
    }
}