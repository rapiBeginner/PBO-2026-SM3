package tugas;

/**
 * kacamataMinus
 */
public class kacamataMinus extends kacamata{
    public double nilaiMinus, indexBias;
    public boolean isSilinder;

    void gantiLensa(double newMinus){
        nilaiMinus=newMinus;
        System.out.println("Nilai minus berubah jadi "+nilaiMinus);
    }

    void perbaikiIndexBias(double biasBaru){
        indexBias=biasBaru;
        System.out.println("Nilai index baru adalah "+indexBias);
    }

    void gantiSilinder(){
        isSilinder=!(isSilinder);
        System.out.println("Nilai silider sekarang menjadi "+isSilinder);
    }
}