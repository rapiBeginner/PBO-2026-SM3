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
}