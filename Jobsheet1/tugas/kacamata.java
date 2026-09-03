package tugas;

public class kacamata {
    public boolean isPhotocromic, isFrameFlexible;
    public String warnaLensa, bahanFrame;
    public double harga;

    public void pakai() {
        System.out.println("Kacamata dipakai");
    }

    public void lepas() {
        System.out.println("Kacamata dilepas");
    }

    public void tutupFrame() {
        System.out.println("Frame ditekuk/ditutup");
    }

    public void bukaFrame() {
        System.out.println("Frame/engsel dibuka");
    }

    public void tampilInformasi() {
        System.out.println("=== Informasi Kacamata ===");
        System.out.println("Photocromic      : " + isPhotocromic);
        System.out.println("Frame Flexible   : " + isFrameFlexible);
        System.out.println("Warna Lensa      : " + warnaLensa);
        System.out.println("Bahan Frame      : " + bahanFrame);
        System.out.println("Harga            : " + harga);
    }
}
