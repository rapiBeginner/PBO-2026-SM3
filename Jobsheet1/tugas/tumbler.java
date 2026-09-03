package tugas;

public class tumbler {
    public double volume, tinggi;
    public boolean isTermos;
    public String warna, bahan;

    tumbler(double volume, String warna, String bahan) {
        this.volume = volume;
        this.bahan = bahan;
        this.warna = warna;
    }

    void buka() {
        System.out.println("Botol dibuka");
    }

    void tutup() {
        System.out.println("Botol ditutup");
    }

    void diisiAir() {
        System.out.println("Air dimasukkan...");
    }

    void tuangkanAir() {
        System.out.println("Menuangkan Air...");
    }

    public void tampilInformasi() {
        System.out.println("=== Informasi Tumbler ===");
        System.out.println("Volume         : " + volume);
        System.out.println("Tinggi         : " + tinggi);
        System.out.println("Termos         : " + isTermos);
        System.out.println("Warna          : " + warna);
        System.out.println("Bahan          : " + bahan);
    }
}
