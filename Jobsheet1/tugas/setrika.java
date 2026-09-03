package tugas;

public class setrika {
    public String merek;
    public double suhuMax, suhuMin, suhuSekarang=0;

    setrika(String merek, double suhuMax){
        this.merek=merek;
        this.suhuMax=suhuMax;
    }

    void nyalakan(){
        System.out.println("Setrika dinyalakan");
    }

    void matikan(){
        System.err.println("Setrika dimatikan");
    }
}
