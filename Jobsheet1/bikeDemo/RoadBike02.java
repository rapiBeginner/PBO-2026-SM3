package bikeDemo;

public class RoadBike02 extends Bike02{
    private int tirewidth;

    public void setTireWidth(int width){
        tirewidth=width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width  :   "+tirewidth+ " nm");
        System.out.println("Bike Type   :   Road Bike");
    }
}
