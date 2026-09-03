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

    void naikkanSuhu(double suhuNaik){
        if (suhuNaik+suhuSekarang>suhuMax) {
            System.out.println("Terlalu panas, tidak bisa dinaikkan");
        }else{
            suhuSekarang+=suhuNaik;
        }
    }
    void turunkanSuhu(double suhuTurun){
        if (suhuSekarang-suhuTurun<suhuMin) {
            System.out.println("Terlalu dingin, tidak bisa dikurangi lagi");
        }else{
            suhuSekarang-=suhuTurun;
        }
    }
}
