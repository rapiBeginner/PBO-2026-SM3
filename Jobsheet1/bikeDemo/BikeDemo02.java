package bikeDemo;

/**
 * BikeDemo02
 */
public class BikeDemo02 {
    public static void main(String[] args) {
        Bike02 mountainBike1 = new Bike02();
        Bike02 mountainBike2 = new Bike02();
        RoadBike02 roadBike1 = new RoadBike02();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();
        System.out.println();
        
        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();
        System.out.println();
        
        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}