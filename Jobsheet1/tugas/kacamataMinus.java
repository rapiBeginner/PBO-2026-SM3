package tugas;

/**
 * kacamataMinus
 */
public class kacamataMinus extends kacamata {
    public double nilaiMinus, indexBias;
    public boolean isSilinder;

    void gantiLensa(double newMinus) {
        nilaiMinus = newMinus;
        System.out.println("Nilai minus berubah jadi " + nilaiMinus);
    }

    void perbaikiIndexBias(double biasBaru) {
        indexBias = biasBaru;
        System.out.println("Nilai index baru adalah " + indexBias);
    }

    void gantiSilinder() {
        isSilinder = !(isSilinder);
        System.out.println("Nilai silider sekarang menjadi " + isSilinder);
    }

    public void tampilInformasi() {
        System.out.println("=== Informasi Kacamata Minus ===");
        System.out.println("Photocromic      : " + isPhotocromic);
        System.out.println("Frame Flexible   : " + isFrameFlexible);
        System.out.println("Warna Lensa      : " + warnaLensa);
        System.out.println("Bahan Frame      : " + bahanFrame);
        System.out.println("Harga            : " + harga);
        System.out.println("Nilai Minus      : " + nilaiMinus);
        System.out.println("Index Bias       : " + indexBias);
        System.out.println("Silinder         : " + isSilinder);
    }
}