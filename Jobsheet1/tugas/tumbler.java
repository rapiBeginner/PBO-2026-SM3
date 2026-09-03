package tugas;

public class tumbler {
    public double volume, tinggi;
    public boolean isTermos;
    public String warna, bahan;

    tumbler(double volume, String warna, String bahan){
        this.volume=volume;
        this.bahan=bahan;
        this.warna=warna;
    }

    void buka(){
        System.out.println("Botol dibuka");
    }

    void tutup(){
        System.out.println("Botol ditutup");
    }
}
