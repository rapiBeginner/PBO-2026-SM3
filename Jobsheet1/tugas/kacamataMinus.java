package tugas;

/**
 * kacamataMinus
 */
public class kacamataMinus extends kacamata{
    public double nilaiMinus;

    void gantiLensa(double newMinus){
        nilaiMinus=newMinus;
        System.out.println("Nilai minus berubah jadi "+nilaiMinus);
    }
}