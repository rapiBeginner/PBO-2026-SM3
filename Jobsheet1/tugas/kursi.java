package tugas;

public class kursi {
    public boolean punyaSandaran;
    public String bahan;
    public double bobotKG;

    kursi(boolean punyaSandaran, String bahan, double bobotKG){
        this.punyaSandaran=punyaSandaran;
        this.bahan=bahan;
        this.bobotKG=bobotKG;
    }

    void diduduki(){
        System.out.println("kursi diduduki");
    }

    void dikosongkan(){
        System.out.println("kuris dikosongkan");
    }
}
